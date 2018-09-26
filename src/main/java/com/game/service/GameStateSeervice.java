package com.game.service;

import com.game.core.Game;

public interface GameStateSeervice {
    void saveGameState(Game currentGameState);
    Game loadGameState();
}
