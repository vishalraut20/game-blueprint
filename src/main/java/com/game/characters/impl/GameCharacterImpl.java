package com.game.characters.impl;

import com.game.characters.GameCharacter;

public class GameCharacterImpl implements GameCharacter {

    private String characterName;
    private int level;

    public GameCharacterImpl(String characterName){
        this.setCharacterName(characterName);
        setLevel(0);
    }

    public String getCharacterName() {
        return characterName;
    }

    private void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void move() {

    }

    public int getLevel() {
        return level;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    public void increaseCharacterLevel(){
        this.level++;
    }
}
