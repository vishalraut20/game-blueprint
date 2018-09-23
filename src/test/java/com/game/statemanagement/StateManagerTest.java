package com.game.statemanagement;

import com.game.core.Game;
import com.game.statemanagement.impl.StateManagerImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class StateManagerTest {
    private static final String playerName1 = "Player1";

    private StateManager stateManager;
    @Before
    public void setup(){
        stateManager = new StateManagerImpl();
    }

    @Test
    public void testSaveState() throws IllegalArgumentException {
        Game game = new Game();
        game.registerPlayer(playerName1);
        stateManager.saveGameState(game);
        Game savedGame = stateManager.loadGameState();
        assertNotNull(savedGame.playerInfoByName(playerName1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveState_GameNull() throws IllegalArgumentException {
        stateManager.saveGameState(null);
        Game savedGame = stateManager.loadGameState();
        assertNotNull(savedGame.playerInfoByName(playerName1));
    }
}
