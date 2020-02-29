package com.example.blackjack;

public class Card {
    private char type;
    private int amount;
    public Card(char type, int amount){
        this.type = type;
        this.amount = amount;
    }


    public char getType() {
        return this.type;
    }

    public int getAmount(){
        return this.amount;
    }

    public void setType(char type){
        this.type = type;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return this.amount + " of " + this.type;
    }
}
