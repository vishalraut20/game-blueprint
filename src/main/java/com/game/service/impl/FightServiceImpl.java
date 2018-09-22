package com.game.service.impl;

import com.game.arena.Arena;
import com.game.characters.GameCharacter;
import com.game.characters.impl.GameCharacterImpl;
import com.game.core.Game;
import com.game.service.FightService;

public class FightServiceImpl implements FightService {

    private Arena arena;
//    private Game game;

    public FightServiceImpl(Arena arena){
        this.arena = arena;
//        this.game = game;
    }

    //Need to decide whether default player will be created here or at the time of game initialization
    public GameCharacter fightWithDefaultCharacter(GameCharacter fightCharacter) {
        GameCharacter defaultCharacter = new GameCharacterImpl("Default");
        GameCharacter winner = arena.combat(fightCharacter, defaultCharacter);
        if(winner  == fightCharacter){
            fightCharacter.increaseCharacterLevel();
        }
        return winner;
    }
}
