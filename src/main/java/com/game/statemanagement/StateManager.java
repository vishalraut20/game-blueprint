package com.game.statemanagement;

import com.game.core.Game;

public interface StateManager {
    public void saveGameState(Game currentGameState) throws IllegalArgumentException;
    public Game loadGameState();
}
