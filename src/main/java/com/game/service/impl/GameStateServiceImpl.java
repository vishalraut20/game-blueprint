package com.game.service.impl;

import com.game.core.Game;
import com.game.service.GameStateSeervice;
import com.game.statemanagement.StateManager;

public class GameStateServiceImpl implements GameStateSeervice {

    private StateManager gameStateManager;

    public GameStateServiceImpl(StateManager gameStateManager){
        this.gameStateManager = gameStateManager;
    }

    public void saveGameState(Game currentGameState){
        gameStateManager.saveGameState(currentGameState);
    }

    public Game loadGameState() {
        return gameStateManager.loadGameState();
    }

}
