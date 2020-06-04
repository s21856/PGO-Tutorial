package com.lab09;

public class Lion extends Feline {
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Lion's noise");
    }
}