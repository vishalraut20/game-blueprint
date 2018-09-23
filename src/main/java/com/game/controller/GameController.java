package com.game.controller;

import com.game.core.Game;
import com.game.dtos.CreateCharacterDTO;
import com.game.characters.GameCharacter;
import com.game.players.Player;
import com.game.service.FightService;
import com.game.service.GameService;
import com.game.service.GameStateSeervice;

public class GameController {
    private FightService fightService;
    private GameService gameService;
    private GameStateSeervice stateService;

    public GameController(FightService fightService,
                          GameService gameService,
                          GameStateSeervice stateService){
        this.fightService = fightService;
        this.gameService = gameService;
        this.stateService = stateService;

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

    public void saveGameState(){
        stateService.saveGameState();
    }

    public Game loadGameState(){
        return stateService.loadGameState();
    }

    public void getStats(Player player) {
        gameService.getStats(player);
    }
}
