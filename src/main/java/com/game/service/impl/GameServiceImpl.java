package com.game.service.impl;

import com.game.characters.GameCharacter;
import com.game.characters.impl.GameCharacterImpl;
import com.game.core.Game;
import com.game.dtos.CreateCharacterDTO;
import com.game.players.Player;
import com.game.service.GameService;

public class GameServiceImpl implements GameService {

    private Game game;
    public GameServiceImpl(Game game){
        this.game = game;
    }
    public void explore() {
        System.out.println("Player is exploring");
    }

    public GameCharacter createCharacter(CreateCharacterDTO characterInfo) {
        Player currentPlayer = game.playerInfoByName(characterInfo.getPlayerName());
        GameCharacter newCharacter = new GameCharacterImpl(characterInfo.getCharacterName());
        currentPlayer.addCharacterToPlayer(newCharacter);
        return newCharacter;
    }

    public Player registerPlayer(String playerName) {
        return game.registerPlayer(playerName);
    }

    public void getStats(Player player) {

    }

    public Game currentGameState() {
        return this.game;
    }
}
