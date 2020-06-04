package com.lab09;

public class Wolf extends Canine {
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Wolf's noise");
    }
}