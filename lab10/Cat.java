package com.lab10;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public void start() {
        System.out.println("Cat starts!");
    }

    @Override
    public void stop() {
        System.out.println("Cat stopped!");
    }
}