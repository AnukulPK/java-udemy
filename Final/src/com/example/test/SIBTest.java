package com.example.test;



public class SIBTest {
    public static final String owner;

    static{
        owner="Anukul";
        System.out.println("SIBTest static initilization block called");
    }

    public SIBTest(){
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initilization block called");
    }

    public void someMethod(){
        System.out.println("somemethod called");
    }
}
