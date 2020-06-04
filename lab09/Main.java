package com.lab09;

public class Main {

    public static void main(String[] args) {
        //Task 1 + 2
        Car c1 = new Car(4);
        c1.start();
        c1.stop();

        //Task 3 + 4
        Animal a1 = new Animal();
        a1.makeNoise();
        Lion l1 = new Lion();
        l1.makeNoise();
        l1.roam();
        Wolf w1 = new Wolf();
        w1.makeNoise();
        w1.roam();
    }
}