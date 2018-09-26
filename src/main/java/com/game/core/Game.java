package com.game.core;

import com.game.players.Player;
import com.game.players.impl.PlayerImpl;

import java.io.Serializable;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public class Game implements Serializable {
    private Map<String, Player> playersInTheGame;

    public Game(){
        playersInTheGame = new HashMap<>();
    }

    public Player registerPlayer(String playerName) throws InvalidParameterException{
        if(playersInTheGame.get(playerName) != null){
            throw new InvalidParameterException("Player name already exists");
        }
        Player newPlayer = new PlayerImpl(playerName);
        playersInTheGame.put(playerName, newPlayer);
        return newPlayer;
    }

    public Player playerInfoByName(String playerName) throws  InvalidParameterException{
        if(playersInTheGame.get(playerName) == null){
            throw new InvalidParameterException("Player name does not exist");
        }
        return playersInTheGame.get(playerName);
    }
}
