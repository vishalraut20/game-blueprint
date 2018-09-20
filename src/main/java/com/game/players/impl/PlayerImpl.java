package com.game.players.impl;

import com.game.characters.GameCharacter;
import com.game.players.Player;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class PlayerImpl implements Player {
    private String playerName;
    private List<GameCharacter> characters;

    public PlayerImpl(String name){
        this.setPlayerName(name);
        characters = new LinkedList<GameCharacter>();
    }

    public List<GameCharacter> listCharacters() {
        return characters;
    }

    public void addCharacterToPlayer(GameCharacter character) {
        this.characters.add(character);
    }

    public String getPlayerName() {
        return playerName;
    }

    private void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void fight() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerImpl player = (PlayerImpl) o;
        return Objects.equals(playerName, player.playerName) &&
                Objects.equals(characters, player.characters);
    }

    @Override
    public int hashCode() {

        return Objects.hash(playerName, characters);
    }
}
