package com.game.dtos;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CreateCharacterDTO {
    @NotEmpty
    @NotNull
    private String characterName;

    @NotEmpty
    @NotNull
    private String playerName;

    public CreateCharacterDTO(String playerName, String characterName){
        setCharacterName(characterName);
        setPlayerName(playerName);
    }

    public String getCharacterName() {
        return characterName;
    }

    private void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getPlayerName() {
        return playerName;
    }

    private void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
