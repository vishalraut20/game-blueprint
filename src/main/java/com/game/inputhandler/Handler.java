package com.game.inputhandler;

import com.game.characters.GameCharacter;
import com.game.controller.GameController;
import com.game.dtos.CreateCharacterDTO;
import com.game.players.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Handler {
    private GameController controller;
    private String currentPlayerName;
    private Map<String, Operation> initialOperationMap = new HashMap<>();
    private Map<String, Operation> mainOperationMap = new HashMap<>();
    private Map<String, Operation> characterOperationMap = new HashMap<>();
    private Map<String, Operation> fightOperationMap = new HashMap<>();
    private Map<String, Operation> exploreOperationMap = new HashMap<>();
    private Stack<Map<String, Operation>> operationStack = new Stack<>();

    public Handler(){
        controller = new GameController();
        initializeInitialOperationMap();
        initializeOperationMap();
        initializeCharacterOperationMap();
        initializeFightOperationMap();
        initializeExploreOperationMap();
        operationStack.push(mainOperationMap);
    }

    public String handleInput(String inputString){
        inputString = inputString.toLowerCase();
        Operation operation = operationStack.peek().get(inputString);
        if(operation ==  null) {
            return Messages.WRONG_INPUT;
        }
        return operation.performOperation(inputString);
    }

    private void initializeOperationMap(){
        Operation createCharacterOperation = (String input) -> {
            operationStack.push(characterOperationMap);
            return Messages.CREATE_CHARACTER;
        };
        mainOperationMap.put("1", createCharacterOperation);

        Operation exploreOperation = (String input) -> {
            operationStack.push(exploreOperationMap);
            return Messages.SELECT_CHARACTER;
        };
        mainOperationMap.put("2", exploreOperation);

        Operation fightOperation = (String input) -> {
            operationStack.push(fightOperationMap);
            return Messages.SELECT_CHARACTER;
        };
        mainOperationMap.put("3", fightOperation);

        Operation saveAndExitOperation = (String input) -> {
            operationStack.push(characterOperationMap);
            System.exit(0);
            return Messages.CREATE_CHARACTER;
        };
        mainOperationMap.put("4", saveAndExitOperation);
    }

    private void initializeCharacterOperationMap(){
        Operation createCharacterOperation = (String input) -> {
            GameCharacter createCharacterOutput = controller.createCharacter(new CreateCharacterDTO(currentPlayerName, input));
            return String.format(Messages.CHARACTER_CREATED, createCharacterOutput.getCharacterName());
        };
        characterOperationMap.put("*", createCharacterOperation);
        Operation goBackOperation = (String input) -> {
            operationStack.pop();
            return Messages.CREATE_CHARACTER;
        };
        characterOperationMap.put("1", goBackOperation);
    }

    private void initializeInitialOperationMap(){
        Operation registerUser = (String input) -> {
            Player registeredPlayer = controller.registerPlayer(input);
            operationStack.push(mainOperationMap);
            return String.format(Messages.REGISTER_PLAYER, registeredPlayer.getPlayerName());
        };
        initialOperationMap.put("*", registerUser);
    }

    private void initializeFightOperationMap(){

    }

    private void initializeExploreOperationMap(){

    }
}
