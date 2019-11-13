package com.company;

import java.util.*;
// new card generator(made);
// card adder(made);
// card shower(made);
// list length(made);
// bets (made)
// bet sum(made)
// exit cases made
public class cardOperations {
    public static Card newCard(){
        Random rand = new Random();
        int num = rand.nextInt(13);
        Card card =new Card(num,num,"","");
        card = new Card(num, num, card.setWriting(num), card.setType(rand.nextInt(5)));
        return card;
    }
    public static void addCard(LinkedList<Card> cards, Card card){
        cards.add(card);
    }
    public static void print(Object object){
        System.out.println(object);
    }
    public static int length(LinkedList<Card> linkedList){
        int num = 0;
        LinkedList<Object> ll = null;
        while(linkedList != null){
            ll.add(linkedList.remove());
            num++;
        }
        while(ll != null){
            linkedList.add((Card) ll.remove());
        }
        return num;
    }
    public static int bet(){
        print("place your bet please");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int betSum(ArrayList<Integer> bets){
        int val = 0;
        int i = 0;
        ArrayList<Integer> k = null;
        while (bets != null){
            k.add(bets.remove(i));
            i++;
            val++;
        }
        i = 0;
        while (k != null){
            bets.add(k.remove(i));
            i++;
        }
        return val;
    }
    public static String note(LinkedList<Card> cards){
        StringBuilder value = new StringBuilder();
        LinkedList<Card> cards1 = cards;
        while(cards1 != null){
            value.append(cards1.remove().toString()).append(" ");
        }
        return value.toString();
    }
    public static void exitCases(int cardSum, LinkedList<Card> cards){
        if (cardSum >21){
            print("the sum of your cards is bigger than 21. \ntheir sum is: " + cardSum + " and the cards are: \n" + note(cards));
            return;
        }
        else if(cardSum == 21){
            print("you won with these lucky bastards: " + note(cards));
        }


    }
}
