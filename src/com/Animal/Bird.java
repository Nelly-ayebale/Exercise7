package com.Animal;

public class Bird extends Animal implements AnimalMove, AnimalName{
    String featherColor;

    public Bird() {
        super();
        featherColor = "Blue";
    }
    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }

    @Override
    public void eat(String food) {
        System.out.println("The bird eats "+ food);
    }

    @Override
    public void getVoice() {
        System.out.println("The bird tweets");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                '}';
    }

    @Override
    public String move() {
        return super.move();
    }
}
