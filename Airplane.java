package com.company;
import com.company.Engine;

class Airplane {
    private String brand;
    private int numberOfSeats;
    private Engine engine;

    public Airplane(String brand, int numberOfSeats){
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public int getProductionYear(){
        return engine.getProductionYear();
    }

    public int getPower(){
        return engine.getPower();
    }

    void check(){
        engine.check();
    }

}