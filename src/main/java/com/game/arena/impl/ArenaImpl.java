package com.game.arena.impl;

import com.game.arena.Arena;
import com.game.characters.GameCharacter;

public class ArenaImpl implements Arena {

    public GameCharacter combat(GameCharacter first, GameCharacter second) {
        if(Math.random() > .5){
            return first;
        }
        return second;
    }
}
