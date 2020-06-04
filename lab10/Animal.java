package com.lab10;

public abstract class Animal implements Moveable{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getType();
    public String getName(){
        return name;
    }
}