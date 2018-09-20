package com.game.characters.impl;

import com.game.characters.GameCharacter;

public class GameCharacterImpl implements GameCharacter {

    private String characterName;

    public GameCharacterImpl(String characterName){
        this.setCharacterName(characterName);
    }

    public String getCharacterName() {
        return characterName;
    }

    private void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void move() {

    }
}
