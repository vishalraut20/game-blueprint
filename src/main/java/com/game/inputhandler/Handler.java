package com.game.inputhandler;

import java.util.HashMap;
import java.util.Map;

public class Handler {
    private Map<String, Operation> operationMap = new HashMap<>();
    private Map<String, Operation> characterOperationMap = new HashMap<>();
    private Map<String, Operation> currentOperationMap;
    private Operation currentOperation = null;

    public Handler(){
        initializeOperationMap();
        initializeCharacterOperationMap();
        currentOperationMap = operationMap;
    }

    public String handleInput(String inputString){
        inputString = inputString.toLowerCase();
        Operation operation = currentOperationMap.get(inputString);
        if(operation ==  null) {
            return Messages.WRONG_INPUT;
        }
        return operation.performOperation(inputString);
    }

    public void initializeOperationMap(){
        Operation createCharacterOperation = (String input) -> {
            currentOperationMap = characterOperationMap;
            return Messages.CREATE_CHARACTER;
        };
        operationMap.put("1", createCharacterOperation);
    }

    public void initializeCharacterOperationMap(){
        Operation createCharacterOperation = (String input) -> Messages.CREATE_CHARACTER;
        operationMap.put("1", createCharacterOperation);
    }
}
