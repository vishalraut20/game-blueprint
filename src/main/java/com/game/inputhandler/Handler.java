package com.game.inputhandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Handler {
    private Map<String, Operation> operationMap = new HashMap<>();
    private Map<String, Operation> characterOperationMap = new HashMap<>();
    private Map<String, Operation> fightOperationMap = new HashMap<>();
    private Map<String, Operation> exploreOperationMap = new HashMap<>();
    private Stack<Map<String, Operation>> operationStack = new Stack<>();

    public Handler(){
        initializeOperationMap();
        initializeCharacterOperationMap();
        initializeFightOperationMap();
        initializeExploreOperationMap();
        operationStack.push(operationMap);
    }

    public String handleInput(String inputString){
        inputString = inputString.toLowerCase();
        Operation operation = operationStack.peek().get(inputString);
        if(operation ==  null) {
            return Messages.WRONG_INPUT;
        }
        return operation.performOperation(inputString);
    }

    public void initializeOperationMap(){
        Operation createCharacterOperation = (String input) -> {
            operationStack.push(characterOperationMap);
            return Messages.CREATE_CHARACTER;
        };
        operationMap.put("1", createCharacterOperation);

        Operation exploreOperation = (String input) -> {
            operationStack.push(exploreOperationMap);
            return Messages.SELECT_CHARACTER;
        };
        operationMap.put("2", exploreOperation);

        Operation fightOperation = (String input) -> {
            operationStack.push(fightOperationMap);
            return Messages.SELECT_CHARACTER;
        };
        operationMap.put("3", fightOperation);

        Operation saveAndExitOperation = (String input) -> {
            operationStack.push(characterOperationMap);
            System.exit(0);
            return Messages.CREATE_CHARACTER;
        };
        operationMap.put("4", saveAndExitOperation);
    }

    public void initializeCharacterOperationMap(){
        Operation createCharacterOperation = (String input) -> Messages.CREATE_CHARACTER;
        operationMap.put("*", createCharacterOperation);
        Operation goBackOperation = (String input) -> {
            operationStack.pop();
            return Messages.CREATE_CHARACTER;
        };
        operationMap.put("2", goBackOperation);
    }

    public void initializeFightOperationMap(){

    }

    public void initializeExploreOperationMap(){

    }
}
