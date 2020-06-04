package com.lab09;

public class Dog extends Canine {
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Dog's noise");
    }
}