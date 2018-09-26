package com.game.service;

import com.game.core.Game;
import com.game.dtos.CreateCharacterDTO;
import com.game.characters.GameCharacter;
import com.game.players.Player;

public interface GameService {
    void explore();
    GameCharacter createCharacter(CreateCharacterDTO characterInfo);
    Player registerPlayer(String playerName);
    void getStats(Player player);
    Game currentGameState();
}
