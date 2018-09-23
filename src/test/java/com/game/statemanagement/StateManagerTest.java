package com.game.statemanagement;

import com.game.core.Game;
import com.game.statemanagement.impl.StateManagerImpl;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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
    }

    @Test(expected = InvalidParameterException.class)
    public void testLoadState_NoStatePresent() {
        Game savedGame = stateManager.loadGameState();
        savedGame.playerInfoByName(playerName1);
    }

    @Test
    public void testLoadState_NoStatePresent_1() {
        Game savedGame = stateManager.loadGameState();
        assertNotNull(savedGame);
    }
}
