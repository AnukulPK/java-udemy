package com.company;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(101));
    }

        // write your code here
        public static int sumFirstAndLastDigit(int number){
            if(number<0){
                return -1;
            }

            int sum = 0;
            int firstNumber=0, lastNumber = 0;
            int length = (int) (Math.log10(number)+1);
            lastNumber= number%10;



            System.out.println("First Number" + number);
            System.out.println("Last Number" + lastNumber);
            System.out.println("Calc " + number/(int) Math.pow(10,length-1));
            System.out.println("Calc " + number);
            return length;




        }

}
