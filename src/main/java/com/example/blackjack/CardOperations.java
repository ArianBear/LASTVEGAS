package com.example.blackjack;

import java.util.LinkedList;

public class CardOperations {

    protected static double getRandomIntFromRange(double min, double max){
        double val = (int) (Math.random() * ((max-min)+1));
        return val;
    }

    public static LinkedList<Card>hit(LinkedList<Card> cards){
        LinkedList<Card> rep = cards;
        double amount = getRandomIntFromRange(2.0,14.0);
        double tipe = getRandomIntFromRange(1.0,4.0);
        char type = ' ';
        switch((int)tipe){
            case 1:
                type = 'S';
                break;

            case 2:
                type = 'C';
                break;
            case 3:
                type = 'D';
                break;
            case 4:
                type = 'H';
                break;
        }
        Card toInsert = new Card(type, (int) amount);
        rep.add(toInsert);
        return rep;
    }


}
