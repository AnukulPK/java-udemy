package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();



        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            int age = Calendar.getInstance().get(Calendar.YEAR)-yearOfBirth;

            if(age>=0 && age<=100){
                System.out.println("Your name is " + name + " and your age is " + age);
            }else{
                System.out.println("Invalid year of birth");
            }
        }else{
            System.out.println("Enter a valid year of birth");
        }

        scanner.close();
    }
}
