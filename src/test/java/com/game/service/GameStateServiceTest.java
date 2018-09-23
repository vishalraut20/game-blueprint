package com.game.service;

import com.game.core.Game;
import com.game.service.impl.GameServiceImpl;
import com.game.service.impl.GameStateServiceImpl;
import com.game.statemanagement.StateManager;
import com.game.statemanagement.impl.StateManagerImpl;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GameStateServiceTest {

    private StateManager stateManager;
    private GameService gameService;
    private GameStateSeervice gameStateSeervice;

    @Before
    public void setup(){
        stateManager = new StateManagerImpl();
        gameService = new GameServiceImpl(new Game());
        gameStateSeervice = new GameStateServiceImpl(gameService, stateManager);
    }

    @Test
    public void testSaveGameState(){
        gameStateSeervice.saveGameState();
        assertNotNull(gameStateSeervice.loadGameState());
    }

}
