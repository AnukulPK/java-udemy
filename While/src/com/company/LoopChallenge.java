package com.company;

public class LoopChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }

        int sum = 0;

        while(number%10!=0){
            sum += number%10;
            number = number/10;
//            System.out.println("number = " + number);
//            System.out.println("sum = " + sum);
        }

        return sum;
    }
}
