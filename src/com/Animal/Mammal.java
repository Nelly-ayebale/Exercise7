package com.Animal;

public class Mammal extends Animal {
    private String animal;
    public Mammal() {
        super();
        animal = "Animal";
    }
    public Mammal(String name, int age, int weight,String animal) {
        super(name, age, weight);
        this.animal = animal;
    }
    public Mammal(String name, String animal){
        super(name);
        this.animal=animal;
    }

    @Override
    public void eat(String food) {
        System.out.println("This mammal eats "+ food);
    }

    @Override
    public void getVoice() {
        System.out.println("This mammal makes noise");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "animal='" + animal + '\'' +
                '}';
    }
}
