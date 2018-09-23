package com.game.service;

import com.game.core.Game;

public interface GameStateSeervice {
    public void saveGameState();
    public Game loadGameState();
}
