package com.game.statemanagement.impl;

import com.game.core.Game;
import com.game.statemanagement.StateManager;

import java.io.*;

public class StateManagerImpl implements StateManager {

    private static final String STATE_FILE_LOCATION = "gameState.txt";

    public void saveGameState(Game currentGameState) throws IllegalArgumentException{
        if(currentGameState == null){
            throw new IllegalArgumentException("Game State cannot be null");
        }
        ClassLoader classLoader = this.getClass().getClassLoader();
        try {
            FileOutputStream fs = new FileOutputStream(classLoader.getResource(STATE_FILE_LOCATION).getFile());
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(currentGameState);
            os.close();
            fs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Game loadGameState() {
        Game gameState;
        ClassLoader classLoader = this.getClass().getClassLoader();
        try {
            FileInputStream fs = new FileInputStream(classLoader.getResource(STATE_FILE_LOCATION).getFile());
            ObjectInputStream os = new ObjectInputStream(fs);
            gameState = (Game) os.readObject();
            os.close();
            fs.close();
        } catch (NullPointerException | IOException | ClassNotFoundException e) {
//            e.printStackTrace();
            gameState = new Game();
        }
        return gameState;
    }
}
