package com.company;

class Movie{
    private String movie;

    public Movie(String movie) {
        this.movie = movie;
    }

    public String plot(){
        return "No Plot Here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to takeover planet Earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot(){
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot(){
        return "Imperial forces try to take over the universe";
    }
}

class ForgetableMovie extends Movie{
    public ForgetableMovie() {
        super("Forgetable Movie");
    }

    //No Plot Method
}

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
}


