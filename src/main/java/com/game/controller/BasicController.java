package com.game.controller;

import com.game.players.Player;

public interface BasicController {
    public void explore();
    public void createCharacter(Player player);
    public void fight(Player player);
    public void getStats(Player player);
}
