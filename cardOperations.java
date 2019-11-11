package com.company;

import java.util.Random;

public class cardOperations {
    public static Card newCard(){
        Random rand = new Random();
        int num = rand.nextInt(13);
        Card card =new Card(num,num,"","");
        card = new Card(num, num, card.setWriting(num), card.setType(rand.nextInt(5)));
        return card;
    }
}
