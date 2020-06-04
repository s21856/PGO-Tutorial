package com.lab09;

public class Cat extends Feline {
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Cat's noise");
    }
}