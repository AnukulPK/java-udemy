package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Player player = new Player();
//        player.fullName="Anukul";
//        player.health = 20;
//        player.weapon="Sword";
//
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("Remaining health="+player.healthRemaining());
//
//        damage=11;
//        player.health=200;
//        player.looseHealth(damage);
//        System.out.println("Remaining health="+player.healthRemaining());
//
//        EnhancedPlayer player = new EnhancedPlayer("Anukul",200,"Sword");
//        System.out.println("Initial health is "+ player.getHealth());

        Printer printer = new Printer(50,false);
        System.out.println("Initial page count = " + printer.getNumberOfPages());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages Printed was " + pagesPrinted + " new total print count for printer = " + printer.getNumberOfPages());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages Printed was " + pagesPrinted + " new total print count for printer = " + printer.getNumberOfPages());

    }
}
