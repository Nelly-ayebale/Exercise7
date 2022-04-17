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

        animal[1].eat("Meat");
        animal[1].getVoice();

        animal[2].eat("Seeds");
        animal[2].getVoice();

        animal[3].eat("Seeds");
        animal[3].getVoice();

        animal[4].eat("bird-seed");
        animal[4].getVoice();

        animal[5].eat("pigeon-seed");
        animal[5].getVoice();

    }

}
