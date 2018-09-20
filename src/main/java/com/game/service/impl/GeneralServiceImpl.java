package com.game.service.impl;

import com.game.characters.GameCharacter;
import com.game.characters.impl.GameCharacterImpl;
import com.game.players.Player;
import com.game.service.GeneralService;

public class GeneralServiceImpl implements GeneralService {
    public void explore() {
        System.out.println("Player is exploring");
    }

    public GameCharacter createCharacter(Player player, String characterName) {
        GameCharacter newCharacter = new GameCharacterImpl(characterName);
        player.addCharacterToPlayer(newCharacter);
        return newCharacter;
    }

    public void getStats(Player player) {

    }
}
