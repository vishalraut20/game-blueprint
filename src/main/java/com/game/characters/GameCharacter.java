package com.game.characters;

public interface GameCharacter {
    public String getCharacterName();
    public void move();
    public int getLevel();
    public void increaseCharacterLevel();
}
