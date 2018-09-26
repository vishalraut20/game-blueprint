package com.game.config;

import com.game.arena.Arena;
import com.game.arena.impl.ArenaImpl;
import com.game.core.Game;
import com.game.service.FightService;
import com.game.service.GameService;
import com.game.service.GameStateSeervice;
import com.game.service.impl.FightServiceImpl;
import com.game.service.impl.GameServiceImpl;
import com.game.service.impl.GameStateServiceImpl;
import com.game.statemanagement.StateManager;
import com.game.statemanagement.impl.StateManagerImpl;

public class AppConfig {

    public static AppConfig appConfig = new AppConfig();
    private AppConfig(){}

    public FightService getFightService(){
        return new FightServiceImpl(getArena());
    }

    public GameService getGameService(){
        return new GameServiceImpl(getGame());
    }

    public Game getGame(){
        return new Game();
    }

    public GameStateSeervice getGameStateService(){
        return new GameStateServiceImpl(getStaetManager());
    }

    public StateManager getStaetManager(){
        return new StateManagerImpl();
    }

    private Arena getArena(){
        return new ArenaImpl();
    }
}
