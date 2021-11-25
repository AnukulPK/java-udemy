package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Car porche = new Car();
//        Car holden = new Car();
//
//        porche.setModel("Carrera");
//        System.out.println("Model is " + porche.getModel());

//        Bank Kotak = new Bank(12345, 0.00, "Anukul", "abc@email.com", "123456890");
//        Bank Kotak = new Bank();
//        System.out.println(Kotak.getAccountNumber());
//        System.out.println(Kotak.getCustomerName());
//        Kotak.setBalance(1000);
//        System.out.println(Kotak.getBalance());
//        Kotak.depositFund(100);
//        Kotak.deductFund(500);
//        Kotak.deductFund(1500);

        VipCustomer anukul = new VipCustomer("Anukul",100.00,"anukul@email.com");
        System.out.println(anukul.getName());

        VipCustomer newDefault = new VipCustomer();
        System.out.println(newDefault.getName());

        VipCustomer someDefault = new VipCustomer("Bob",123.45);
        System.out.println(someDefault.getName());
        System.out.println(someDefault.getEmailAddress());



    }
}
