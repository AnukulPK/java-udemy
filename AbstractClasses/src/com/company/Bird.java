package com.company;

public abstract class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(super.getName()+" is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breath in, Breathe out, repeat");
    }

    public abstract void fly();
}
