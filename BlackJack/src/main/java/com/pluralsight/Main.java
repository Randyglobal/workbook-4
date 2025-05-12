package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Hand hand = new Hand();

//        Deal 5 cards
        for (int i = 0; i < 2; i++){
//            get card from the deck by dealing at the top
            Card card = deck.deal();
//            deal the card to the hand
            hand.deal(card);
        }
        int handValue = hand.getValue();
        System.out.println("This hand is worth " + handValue);
    }
}
