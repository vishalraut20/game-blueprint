package com.game;

import com.game.inputhandler.Handler;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Press numeric options: \n" +
                "Press '1' to create player. \n" +
                "Press '2' to explore.\n" +
                "Press '3' to fight.\n" +
                "Press '4' to save the state of game.\n" +
                "Press '5' to quit the game.\n");
        Scanner scanner = new Scanner(System.in);
        Handler handler = new Handler();
        String input = "";
        while(!input.equals("5")){
            input = scanner.nextLine();
            if(!input.isEmpty() && !input.equals("5")) {
                System.out.println(handler.handleInput(input));
            }
        }
    }
}
