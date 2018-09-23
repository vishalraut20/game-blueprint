package com.game.staetmanagement;

import com.game.core.Game;

public interface StateManager {
    public void saveGameState(Game currentGameState);
    public Game loadGameState();
}
