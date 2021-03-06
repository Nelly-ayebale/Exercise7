package com.Animal;

public class Mammal extends Animal implements AnimalMove, AnimalName{
    private String animal;
    private String moves;

    public Mammal() {
        super();
        animal = "Animal";
        moves = "Hopping";

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

    @Override
    public String move() {
        return super.move();
    }
}
