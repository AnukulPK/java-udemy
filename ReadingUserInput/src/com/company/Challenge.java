package com.company;

import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while(count<=10){
            System.out.println("Enter your number"+ count);
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();
                sum=sum+number;
                ++count;
            }else{
                System.out.println("Enter a valid number");
                break;
            }

        }
        System.out.println("Sum = "+sum);
        scanner.close();

    }
}
