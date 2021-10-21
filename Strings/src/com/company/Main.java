package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//
//        String myString = "This is a string";
//        System.out.println("My string = "+myString);

        double value1 = 20.00;
        double value2 = 80.00;
        double sol1 = (value1+value2)*100.00d;
        double remainder = sol1 % 40.00d;

        boolean answer ;
        if(remainder==0){
            answer = true;
        }else{
            answer = false;
        }

        System.out.println(answer);

        if(!answer ){
            System.out.println("Got some remainder");
        }



    }
}
