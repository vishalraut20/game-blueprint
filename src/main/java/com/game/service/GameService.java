package com.game.service;

import com.game.core.Game;
import com.game.dtos.CreateCharacterDTO;
import com.game.characters.GameCharacter;
import com.game.players.Player;

public interface GameService {
    public void explore();
    public GameCharacter createCharacter(CreateCharacterDTO characterInfo);
    public void registerPlayer(String playerName);
    public void getStats(Player player);
    public Game currentGameState();
}
