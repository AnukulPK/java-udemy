package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;





    public VipCustomer() {
        this("Default Name",0.00,"Default Email address");
        System.out.println("No Parameters added");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"Default Email");
        System.out.println("Some paramters added");
//        this.name = name;
//        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("All parameters added");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
