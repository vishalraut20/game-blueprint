package com.game.service;

import com.game.CreateCharacterDTO;
import com.game.core.Game;
import com.game.service.impl.GameServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class GameServiceTest {

    private static final String playerName1 = "Player1";
    private static final String characterName1 = "Character1";
    GameService gameService;

    @Before
    public void setup(){
        gameService = new GameServiceImpl(new Game());
    }

    @Test
    public void testCreateCharacter(){
        gameService.registerPlayer(playerName1);
        assertEquals(characterName1, gameService.createCharacter(new CreateCharacterDTO(playerName1, characterName1))
                .getCharacterName());
    }

    @Test(expected = InvalidParameterException.class)
    public void testCreateCharacter_PlayerDoesNotExist(){
        assertEquals(characterName1, gameService.createCharacter(new CreateCharacterDTO(playerName1, characterName1)).getCharacterName());
    }
}
