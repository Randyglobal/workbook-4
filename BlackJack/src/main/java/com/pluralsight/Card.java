package com.pluralsight;

public class Card {
    private String suit = "";
    private String value = "";
    private boolean isFaceUp = false;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = isFaceUp;
    }

    public String getSuit() {
        if (isFaceUp){
            return suit;
        }else {
            return "Still Thinking";
        }
    }

    public String getValue() {
        if (isFaceUp){
            return value;
        }else {
            return "Still Thinking";
        }
    }
    public int getPointValue(){
        if (isFaceUp){
            try {
//              convert to an int
                return Integer.parseInt(value);
            }catch (NumberFormatException e){
             switch (value){
                 case "King":
                 case "Queen":
                 case "Jack":
                     return 10;
                 case "Ace":
//                     Ace could either be 1 or 11 depending on the hand, more logic in the hand class
                     return 11;
                 default:
                     return 0;
             }
            }
        }else {
            return 0;
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }
    public void flip(){
        isFaceUp = !isFaceUp;
    }
}
