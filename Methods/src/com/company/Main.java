package com.company;

public class Main {
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name+" managed to get into position "+position+" on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if(playerScore>=1000){
           position=1;
        }else if(playerScore>=500){
            position= 2;
        }else if(playerScore>=100){
            position= 3;
        }
        return position;
    }

    public static void main(String[] args) {
	// write your code here
        int position1 = calculateHighScorePosition(1500);
        int position2 = calculateHighScorePosition(900);
        int position3 = calculateHighScorePosition(400);
        int position4 = calculateHighScorePosition(50);
        int position5 = calculateHighScorePosition(1000);
        displayHighScorePosition("Anukul",position1);
        displayHighScorePosition("Bhagya",position2);
        displayHighScorePosition("Leena",position3);
        displayHighScorePosition("Krishnakumar",position4);
        displayHighScorePosition("Sujay",position5);

    }


}
