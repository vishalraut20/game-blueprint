package com.game.core;

import com.game.players.Player;
import com.game.players.impl.PlayerImpl;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public class Game {
    private Map<String, Player> playersInTheGame;

    public Game(){
        playersInTheGame = new HashMap<>();
    }

    public void registerPlayer(String playerName) throws InvalidParameterException{
        if(playersInTheGame.get(playerName) != null){
            throw new InvalidParameterException("Player name already exists");
        }
        playersInTheGame.put(playerName, new PlayerImpl(playerName));
    }

    public Player playerInfoByName(String playerName) throws  InvalidParameterException{
        if(playersInTheGame.get(playerName) == null){
            throw new InvalidParameterException("Player name does not exist");
        }
        return playersInTheGame.get(playerName);
    }
}
