package com.lab10;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public double getArea() {
        double pi = 3.14;
        return Math.PI*radius*radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }
}