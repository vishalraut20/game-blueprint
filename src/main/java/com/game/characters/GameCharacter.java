package com.game.characters;

import java.io.Serializable;

public interface GameCharacter extends Serializable {
    public String getCharacterName();
    public void move();
    public int getLevel();
    public void increaseCharacterLevel();
}
