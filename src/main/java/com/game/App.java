package com.game;

import com.game.inputhandler.Handler;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Enter a player name:");
        Scanner scanner = new Scanner(System.in);
        Handler handler = new Handler();
        while(true){
            String input = scanner.nextLine();
            if(!input.isEmpty()) {
                System.out.println(handler.handleInput(input));
            }
        }
    }
}
