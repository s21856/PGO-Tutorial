package com.lab07;

public class Furniture {
    private String name;
    private double price;
    public static final double VAT = 0.1;

    public Furniture(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getPrice(String withVAT){
        return price-price*VAT;
    }
}