package com.game.arena;

import com.game.arena.impl.ArenaImpl;
import com.game.characters.GameCharacter;
import com.game.characters.impl.GameCharacterImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArenaImplTest {

    private Arena arena;

    @Before
    public void setup(){
        arena = new ArenaImpl();
    }
    @Test
    public void testCombat(){
        assertNotNull(arena.combat(
                new GameCharacterImpl("one"),
                new GameCharacterImpl("two")));
    }
}
