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
        int yearOfBirth = scanner.nextInt();
        int age = Calendar.getInstance().get(Calendar.YEAR)-yearOfBirth;

        System.out.println("Your name is " + name + " and your age is " + age);
        scanner.close();
    }
}
