package com.game.service;

import com.game.characters.GameCharacter;
import com.game.players.Player;

public interface GeneralService {
    public void explore();
    public GameCharacter createCharacter(String player, String characterName);
    public void registerPlayer(String playerName);
    public void getStats(Player player);
}
