package com.game.controller;

import com.game.characters.GameCharacter;
import com.game.players.Player;
import com.game.service.FightService;
import com.game.service.GeneralService;

public class GameController {
    private FightService fightService;
    private GeneralService generalService;

    public GameController(FightService fightService,
                          GeneralService generalService){
        this.fightService = fightService;
        this.generalService = generalService;

    }
    public void explore() {
        generalService.explore();
    }

    public GameCharacter createCharacter(Player player, String characterName) {
        return generalService.createCharacter(player, characterName);
    }

    public void fight(Player player) {
        fightService.fight(player);
    }

    public void getStats(Player player) {
        generalService.getStats(player);
    }
}
