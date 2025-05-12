package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
     homeScreen();
    }
    public static void homeScreen(){
        System.out.println("======== Welcome to BlackJack MIGHTY GAME ========||");
        boolean display = true;
        while (display){
            System.out.println("1) - Play New Game");
            System.out.println("2) - Exit");
            System.out.println("       || =============================||");
            int answer = scanner.nextInt();
            switch (answer){
                case 1:
                    GameBoard.gameBoard();
                    break;
                case 2:
                    return;
            }
        }
    }
}
