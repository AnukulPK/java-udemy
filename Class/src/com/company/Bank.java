package com.company;

public class Bank {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double income){
        double newBalance = this.balance+income;
        System.out.println("Your new account balance is "+ newBalance);
    }

    public void deductFund(double deduction){
        if(this.balance-deduction<0){
            System.out.println("Insufficient Balance");

        }else{
            double newBalance = this.balance-deduction;
            System.out.println("Your new account balance is "+ newBalance);
        }
    }
}
