package com.company;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
    }

    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }

        int reverseNumber = reverse(number);

        for(int i =0;i<getDigitCount(number);i++){
            switch (reverseNumber%10){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:break;
            }

            reverseNumber = reverseNumber/10;
        }

        System.out.println();
    }

    public static int reverse(int number){
        int reverse = 0;
        while(number!=0){
            int remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;
        }

        return reverse;
    }

    public static int getDigitCount(int number){
        int count =0;
        if(number ==0){
            count =1;
        } else if(number<0){
            count =-1;
        }else {
            while (number != 0) {
                number = number / 10;
                count += 1;
            }
        }
        return count;
    }
}
