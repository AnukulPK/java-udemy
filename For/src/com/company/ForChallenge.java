package com.company;

public class ForChallenge {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i<=1000;i++ ){
            if(i%3==0 && i%5==0 && count!=5){
                sum+=i;
                ++count;
                System.out.println("Found Number is " + i);
            }
        }

        System.out.println("The sum is "+sum);
    }
}
