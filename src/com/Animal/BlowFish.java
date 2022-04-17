package com.Animal;

public class BlowFish extends Fish implements AnimalMove,AnimalName{
    private String species;

    public BlowFish(String species) {
        super();
        species = "Species";
    }

    public BlowFish(String name, int age, int weight, String jawless, String species) {
        super(name, age, weight, jawless);
        this.species = species;
    }

    public BlowFish(String name, String jawless, String species) {
        super(name, jawless);
        this.species = species;
    }
    @Override
    public void eat(String food) {
        System.out.println("The fish eats "+ food);
    }

    @Override
    public void getVoice() {
        System.out.println("The fish bubbles");;
    }

    @Override
    public String toString() {
        return "BlowFish{" +
                "species='" + species + '\'' +
                '}';
    }

    @Override
    public String move() {
        return super.move() + "by swimming";
    }
}
