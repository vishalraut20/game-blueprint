package com.game.players;

import com.game.characters.GameCharacter;

import java.io.Serializable;
import java.util.List;

public interface Player extends Serializable {
    public List<GameCharacter> listCharacters();
    public void addCharacterToPlayer(GameCharacter character);
    public void fight();
    public String getPlayerName();
}
