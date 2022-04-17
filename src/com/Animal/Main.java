package com.Animal;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Courage","Dog");
        animal[1] = new Dog("Lulu","Dog","Chihuahua");
        animal[2] = new Fish("Nemo","jawless");
        animal[3] = new BlowFish("Nemo","jawless","Clown-fish");
        animal[4] = new Bird("Duck","White");
        animal[5] = new Pigeon("Pieg","grey","flying-bird");

//        animal[1].eat("Meat");
//        animal[1].getVoice();
//
//
//        animal[2].eat("Seeds");
//        animal[2].getVoice();
//
//        animal[3].eat("Seeds");
//        animal[3].getVoice();
//
//        animal[4].eat("bird-seed");
//        animal[4].getVoice();
//
//        animal[5].eat("pigeon-seed");
//        animal[5].getVoice();

        for (Animal a: animal) {
            System.out.println(a.move());

        }
        for (Animal a: animal) {
            AnimalName.name(a.getName());
        }
        AnimalBehavior animalBehavior[] = new AnimalBehavior[3];

        animalBehavior[0] = new Dog("Brandy","dog","Chihuahua");
        animalBehavior[1] = new Pigeon("Tweeky","blue","robin");
        animalBehavior[2] = new BlowFish("Willy","Goldfish","jawless");

        animalBehavior[0].sleep("sleeps");
        animalBehavior[1].sleep("Sleeps in a nest");
        animalBehavior[2].sleep("doesn't sleep");

    }

}
