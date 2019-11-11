package com.company;

public class Card{
    private String writing;
    private int value;
    private int serialValue;
    private String type;
    public Card(int value, int serialValue, String writing, String type){
        this.type = type;
        this.writing = writing;
        this.serialValue = serialValue;
        this.value = value;
    }
    public String getWriting(){
        return this.writing;
    }
    public int getValue(){
        return this.value;
    }
    public int getSerialValue(){
        return  this.serialValue;
    }
    public String getType(){
        return this.type;
    }
    public String setWriting(int serialValue){
        switch (serialValue){
            case 1:{
                writing = "Ace";
                break;
            }
            case 2:{
                writing = "Two";
                break;
            }
            case 3:{
                writing = "Three";
                break;
            }
            case 4:{
                writing = "Four";
                break;
            }
            case 5:{
                writing = "Five";
                break;
            }
            case 6:{
                writing = "Six";
                break;
            }
            case 7:{
                writing = "Seven";
                break;
            }
            case 8:{
                writing = "Eight";
                break;
            }
            case 9:{
                writing = "Nine";
                break;
            }
            case 10:{
                writing = "Ten";
                break;
            }
            case 11:{
                writing = "Jack";
                break;
            }
            case 12:{
                writing = "Queen";
                break;
            }
            case 13:{
                writing = "King";
                break;
            }

        }
        return writing;
    }
    public String setType(int num){
        this.type = "";
        switch(num){
            case 1: {
                type = "Diamonds";
                break;
            }
            case 2:{
                type = "Clubs";
                break;
            }
            case 3:{
                type = "Hearts";
                break;
            }
            case 4:{
                type = "Spades";
                break;
            }
        }
        return type;
    }

    @Override
    public String toString(){
        return setWriting(this.serialValue)  + " Of "  + this.type;
    }

}
