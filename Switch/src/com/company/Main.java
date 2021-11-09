package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int switchValue = 3;
//        switch(switchValue){
//            case 1: System.out.println("Value was one");
//            break;
//
//            case 2: System.out.println("Value was two");
//                break;
//
//            default:System.out.println("Was not 1 or 2");
//            break;
//        }
        char letterToBeChecked='Z';

        switch (letterToBeChecked){
            case 'A':
                System.out.println("Letter A found");
                break;
            case 'B':
                System.out.println("Letter B Found");
                break;
            case 'C':
                System.out.println("Letter C Found");
                break;
            case 'D':
                System.out.println("Letter D Found");
                break;
            case 'E':
                System.out.println("Letter E Found");
                break;
            default:
                System.out.println("Letter not found");
                break;
        }
    }
}
