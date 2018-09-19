package com.game.service.impl;

import com.game.players.Player;
import com.game.service.PlayerService;

public class PlayerServiceImpl implements PlayerService {

    public void createCharacter(Player player) {
        player.createCharacter();
    }

    public void getStats(Player player) {

    }
}
