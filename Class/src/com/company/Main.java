package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Car porche = new Car();
//        Car holden = new Car();
//
//        porche.setModel("Carrera");
//        System.out.println("Model is " + porche.getModel());

        Bank Kotak = new Bank();

        Kotak.setBalance(1000);
        System.out.println(Kotak.getBalance());
        Kotak.depositFund(100);
        Kotak.deductFund(500);
        Kotak.deductFund(1500);

    }
}
