package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int count = 1;
//        while(count!=5){
//            System.out.println("Count value is " + count);
//            count++;
//        }

        int number = 4;
        int finishNumber = 20;
        int countOfEvenNumbers = 0;

        while(number<=finishNumber){
            number++;

            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            countOfEvenNumbers++;

            if(countOfEvenNumbers>=5){
                break;
            }


        }

        System.out.println("Total number of even numbers found "+countOfEvenNumbers);
    }

    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }else return  false;
    }
}
