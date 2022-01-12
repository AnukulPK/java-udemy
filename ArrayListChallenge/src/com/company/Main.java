package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone= new MobilePhone("123456789");

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        startPhone();
        printActions();

        while(!quit){
            System.out.println("Enter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Shutting down...");
                    quit=true;
                    break;
                case 1: mobilePhone.printContacts();
                        break;
                case 2: addNewContact();
                        break;
                case 3: updateContact();
                        break;
                case 4: removeContact();
                        break;
                case 5: queryContact();
                        break;
                case 6: printActions();
                        break;
            }
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact exisitingContactRecord = mobilePhone.queryContact(name);

        if (exisitingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: "+exisitingContactRecord.getName()+" Phone Number is "+exisitingContactRecord.getPhoneNumber());
    }



    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact exisitingContactRecord = mobilePhone.queryContact(name);

        if (exisitingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(exisitingContactRecord)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        };
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact exisitingContactRecord =  mobilePhone.queryContact(name);

        if(exisitingContactRecord==null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newPhone = scanner.nextLine();
        Contact newContact= new Contact(newName, newPhone);
        if(mobilePhone.updateContact(exisitingContactRecord,newContact)){
            System.out.println("Successfuly updated record");
        }else{
            System.out.println("Error updating record");
        }

    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);

        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = "+name+ ",phone = "+phone);
        }else{
            System.out.println("Cannot add, "+name+" already on file");
        }
    }

    private static void startPhone(){
        System.out.println("Starting Phone....");
    }

    private static void printActions(){
        System.out.println("Available actions and instructions. Choose an action");
    }
}
