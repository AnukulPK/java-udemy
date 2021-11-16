package com.company;

public class FindGreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }else {

            if (first == 0) {
                return second;
            }

            if (second == 0) {
                return first;
            }

            if (first == second) {
                return first;
            }

            if (first > second) {
                return getGreatestCommonDivisor(first - second, second);
            } else return getGreatestCommonDivisor(first, second - first);
        }

    }
}
