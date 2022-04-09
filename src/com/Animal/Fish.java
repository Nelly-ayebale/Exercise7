package com.Animal;

public class Fish extends Animal{
    String jawless;

    public Fish() {
        super();
        jawless = "jawless";
    }

    public Fish(String name, int age, int weight, String jawless) {
        super(name, age, weight);
        this.jawless = jawless;
    }

    public Fish(String name, String jawless) {
        super(name);
        this.jawless = jawless;
    }
    @Override
    public void eat(String food) {
        System.out.println("This fish eats "+food);
    }

    @Override
    public void getVoice() {
        System.out.println("This fish makes no noise");
    }
}
