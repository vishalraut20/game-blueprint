package com.game.controller;

import com.game.config.AppConfig;
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

    public GameController(){
        AppConfig appConfig = AppConfig.appConfig;
        this.fightService = appConfig.getFightService();
        this.gameService = appConfig.getGameService();
        this.stateService = appConfig.getGameStateService();

    }
    public Player registerPlayer(String playerName){
        return gameService.registerPlayer(playerName);
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
        stateService.saveGameState(this.gameService.currentGameState());
    }

    public Game loadGameState(){
        return stateService.loadGameState();
    }

    public void getStats(Player player) {
        gameService.getStats(player);
    }
}
