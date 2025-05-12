package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private static ArrayList<Card> cards = new ArrayList<>();

    public void deal(Card card){
     cards.add(card);
    }
    public int getSize(){
        return cards.size();
    }
    public int getValue(){
        int value = 0;
        int ace = 0;
//     to get the value, we will need to flip the card first to show the value, the flip back to hide
//        We originally start counting the aces by 11, and since a hand should hold not more than 21,
//        but in the case that it is upto 21, the while loop runs reducing the value by 10 and
//        reducing the aces numb by 1
        for (Card card: cards){
            card.flip();
            value += card.getPointValue();
            if (value == 11){
                ace++;
            }
            card.flip();
        }
        while (value > 21 && ace > 0){
            value -=10;
            ace--;
        }
        return value;
    }
}
