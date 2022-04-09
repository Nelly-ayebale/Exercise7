package com.Animal;

public class Dog extends Mammal {
    private String breed;

    public Dog(String breed) {
       super();
       breed = "Animal";
    }

    public Dog(String name, int age, int weight, String animal, String breed) {
        super(name, age, weight, animal);
        this.breed = breed;
    }

    public Dog(String name,String animal, String breed) {
        super(name,animal);
        this.breed = breed;
    }

    @Override
    public void eat(String food) {
        System.out.println("The dog eats "+ food);
    }

    @Override
    public void getVoice() {
        System.out.println("The dog barks");;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}