package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice =0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1: groceryList.printGroceryList();break;
                case 2: addItem();break;
                case 3: modifyItem();break;
                case 4: removeItem();break;
                case 5: searchForItem();break;
                case 6: quit=true;break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("Instructions");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery Item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }

    public static void searchForItem(){
        System.out.print("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem)!=null){
            System.out.println("Found "+searchItem+" in ur grocery list");
        }else{
            System.out.println(searchItem+" not available in the shopping list");
        }
    }
}
