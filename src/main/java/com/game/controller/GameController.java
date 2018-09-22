package com.game.controller;

import com.game.dtos.CreateCharacterDTO;
import com.game.characters.GameCharacter;
import com.game.players.Player;
import com.game.service.FightService;
import com.game.service.GameService;

public class GameController {
    private FightService fightService;
    private GameService gameService;

    public GameController(FightService fightService,
                          GameService gameService){
        this.fightService = fightService;
        this.gameService = gameService;

    }
    public void registerPlayer(String playerName){
        gameService.registerPlayer(playerName);
    }
    public GameCharacter createCharacter(CreateCharacterDTO characterInfo) {
        return gameService.createCharacter(characterInfo);
    }

    public void explore() {
        gameService.explore();
    }

    public void fight(GameCharacter character) {
        fightService.fightWithDefaultCharacter(character);
    }

    public void getStats(Player player) {
        gameService.getStats(player);
    }
}
