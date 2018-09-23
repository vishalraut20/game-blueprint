package com.game.staetmanagement.impl;

import com.game.core.Game;
import com.game.staetmanagement.StateManager;

import java.io.*;

public class StateManagerImpl implements StateManager {

    private static final String STATE_FILE_LOCATION = "gameState.txt";

    public void saveGameState(Game currentGameState) {
//        ClassLoader classLoader = this.getClass().getClassLoader();
        try {
            FileOutputStream fs = new FileOutputStream(STATE_FILE_LOCATION);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(currentGameState);
            os.close();
            fs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Game loadGameState() {
        Game gameState = new Game();
        try {
            FileInputStream fs = new FileInputStream(STATE_FILE_LOCATION);
            ObjectInputStream os = new ObjectInputStream(fs);
            gameState = (Game) os.readObject();
            os.close();
            fs.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return gameState;
    }
}
