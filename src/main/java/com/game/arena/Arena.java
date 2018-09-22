package com.game.arena;

import com.game.characters.GameCharacter;

public interface Arena {
    public GameCharacter combat(GameCharacter first, GameCharacter second);
}
