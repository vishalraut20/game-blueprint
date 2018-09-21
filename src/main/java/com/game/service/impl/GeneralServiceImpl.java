package com.game.service.impl;

import com.game.characters.GameCharacter;
import com.game.characters.impl.GameCharacterImpl;
import com.game.core.Game;
import com.game.players.Player;
import com.game.players.impl.PlayerImpl;
import com.game.service.GeneralService;

public class GeneralServiceImpl implements GeneralService {

    private Game game;
    public GeneralServiceImpl(Game game){
        this.game = game;
    }
    public void explore() {
        System.out.println("Player is exploring");
    }

    public GameCharacter createCharacter(String playerName, String characterName) {
        Player currentPlayer = game.getPlayerInfoByName(playerName);
        GameCharacter newCharacter = new GameCharacterImpl(characterName);
        currentPlayer.addCharacterToPlayer(newCharacter);
        return newCharacter;
    }

    public void registerPlayer(String playerName) {
        game.registerPlayer(playerName);
    }

    public void getStats(Player player) {

    }
}
