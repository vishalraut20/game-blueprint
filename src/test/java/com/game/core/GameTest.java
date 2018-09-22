package com.game.core;

import static org.junit.Assert.*;
import org.junit.Test;

import java.security.InvalidParameterException;

public class GameTest {
    private static final String playerName1 = "player1";
    private Game game = new Game();

    @Test(expected = InvalidParameterException.class)
    public void testGetPlayer_NoPlayerAvailable(){
        game.playerInfoByName(playerName1);
    }

    @Test
    public void testGetPlayer(){
        game.registerPlayer(playerName1);
        assertEquals(playerName1, game.playerInfoByName(playerName1).getPlayerName());
    }

    @Test
    public void testRegisterPlayer(){
        game.registerPlayer(playerName1);
        assertEquals(playerName1, game.playerInfoByName(playerName1).getPlayerName());
    }

    @Test(expected = InvalidParameterException.class)
    public void testRegisterPlayer_PlayerNameAlreadyPresent(){
        game.registerPlayer(playerName1);
        game.registerPlayer(playerName1);
    }

}
