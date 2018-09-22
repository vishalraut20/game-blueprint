package com.game.service;

import com.game.arena.Arena;
import com.game.arena.impl.ArenaImpl;
import com.game.characters.GameCharacter;
import com.game.characters.impl.GameCharacterImpl;
import com.game.service.impl.FightServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FightServiceTest {

    private static final String characterName = "Character1";
    FightService fightService;

    @Before
    public void setup(){
        Arena arena = new ArenaImpl();
        fightService = new FightServiceImpl(arena);
    }

    @Test
    public void testFightWithDefaultCharacter(){
        GameCharacter playersCharacter = new GameCharacterImpl(characterName);
        assertNotNull(fightService.fightWithDefaultCharacter(playersCharacter));
    }
}
