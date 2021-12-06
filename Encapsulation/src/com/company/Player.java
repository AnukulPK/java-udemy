package com.company;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void looseHealth(int damage){
        this.health=this.health-damage;
        if(this.health<0){
            System.out.println("Player knocked out");

            //Reduced number of lives for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
