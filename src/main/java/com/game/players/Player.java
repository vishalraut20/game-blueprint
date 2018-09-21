package com.game.players;

import com.game.characters.GameCharacter;

import java.util.List;

public interface Player {
    public List<GameCharacter> listCharacters();
    public void addCharacterToPlayer(GameCharacter character);
    public void fight();
    public String getPlayerName();
}
