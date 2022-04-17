package com.Animal;

public class Pigeon extends Bird implements AnimalMove, AnimalName, AnimalBehavior{
    String species;

    public Pigeon() {
        super();
        species = "flying-bird";
    }

    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String featherColor, String species) {
        super(name, featherColor);
        this.species = species;
    }

    @Override
    public void eat(String food) {
        System.out.println("The Pigeon eats "+ food);;
    }

    @Override
    public void getVoice() {
        System.out.println("The pigeon coos");;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "species='" + species + '\'' +
                '}';
    }

    @Override
    public String move() {
       return super.move()+ "by flying";

    }

    @Override
    public void sleep(String sleep) {
        System.out.println(this.getClass().getSimpleName() +" "+sleep);
    }
}
