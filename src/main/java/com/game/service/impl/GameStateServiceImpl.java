package com.game.service.impl;

import com.game.core.Game;
import com.game.service.GameService;
import com.game.service.GameStateSeervice;
import com.game.statemanagement.StateManager;

public class GameStateServiceImpl implements GameStateSeervice {

    private StateManager gameStateManager;
    private GameService gameService;

    public GameStateServiceImpl(GameService gameService, StateManager gameStateManager){
        this.gameService = gameService;
        this.gameStateManager = gameStateManager;
    }

    public void saveGameState(){
        gameStateManager.saveGameState(gameService.currentGameState());
    }

    public Game loadGameState() {
        return gameStateManager.loadGameState();
    }

}
