package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class GameBoard {
    static Scanner scanner = new Scanner(System.in);
    public static void gameBoard(){
        ArrayList<String> namesOfPlayers = new ArrayList<>();

        Deck deck = new Deck();
//        shuffle the cards
        deck.shuffle();
//        Getting players
//        playerNames();
        namesOfPlayers.add(playerNames());
//        create the list of players
        ArrayList<Hand> players = new ArrayList<>();

//        number of players
        System.out.println("Enter number of players");
        int numberOfHands = scanner.nextInt();

        int numberOfPlayers = numberOfHands;
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Hand());
        }

//        Cards on each hand
        int cardPerHand = 2;
//        deal card to each player
        for (int i = 0; i < cardPerHand; i++) {
            for (int j = 0; j < numberOfPlayers; j++) {
                Card card = deck.deal();
                if (card != null){
                    players.get(j).deal(card);
                }else{
                    System.out.println("Deck is empty");
                    return;
                }
            }
        }
//        Expose the players hand
        for (int i = 0; i < numberOfPlayers; i++) {
            Hand playersHand = players.get(i);
            if (10 >= playersHand.getValue()){
                System.out.println("Player " + (i + 1) + "'s hand with");
                playersHand.showHand();
                System.out.println("Hand Value: " + playersHand.getValue());
                System.out.println("is the winner");
            }else {
                System.out.println("Player " + (i + 1) + "'s hand with");
                playersHand.showHand();
                System.out.println("Hand Value: " + playersHand.getValue());
            }

        }
    }
    public static String playerNames(){
//        Creating array of names
            System.out.println("Enter Player's Name");
            String player = scanner.nextLine();
            return player;
    }
}
