package com.game.controller.impl;

import com.game.controller.BasicController;
import com.game.players.Player;
import com.game.service.FightService;
import com.game.service.GeneralService;
import com.game.service.PlayerService;

public class ControllerImpl implements BasicController {
    private FightService fightService;
    private PlayerService playerService;
    private GeneralService generalService;

    public ControllerImpl(FightService fightService,
                          PlayerService playerService,
                          GeneralService generalService){
        this.fightService = fightService;
        this.playerService = playerService;
        this.generalService = generalService;

    }
    public void explore() {
        generalService.explore();
    }

    public void createCharacter(Player player) {
        playerService.createCharacter(player);
    }

    public void fight(Player player) {
        fightService.fight(player);
    }

    public void getStats(Player player) {
        playerService.getStats(player);
    }
}
