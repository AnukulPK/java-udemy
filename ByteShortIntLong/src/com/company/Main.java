package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue =10000;

        int myMinIntValValue = Integer.MIN_VALUE;
        int myMaxIntValValue = Integer.MAX_VALUE;

        System.out.println(myMaxIntValValue +" , "+ myMinIntValValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMaxByteValue + " " + myMinByteValue );

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue + " " + myMaxShortValue );

     long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue + " " + myMaxLongValue );

        int myTotal = myMinIntValValue/2;
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue = (short) (myMinShortValue/2);
//        System.out.println();


        byte num1 = 10;
        short num2 = 20;
        int num3 = 50;
        long newNumber = 50000+10*(num1+num2+num3);

        short shortTotal = (short)(1000 + 10 * (num1+num2+num3));

        System.out.println(newNumber);
        System.out.println(shortTotal);

    }
}
