package com.Animal;

public abstract class Animal implements AnimalMove, AnimalName{
    String name;
    String animalMove;
    int age;
    int weight;

    public Animal(){
        age = weight = 0;
        name = "Animal";
        animalMove = "runs";
    }

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public abstract void eat(String food);
    public abstract void getVoice();


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public String move() {
        return AnimalMove.super.move();
    }

}
