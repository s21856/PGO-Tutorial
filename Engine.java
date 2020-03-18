package com.company;

class Engine {
    private int power;
    private int productionYear;

    public Engine(int power, int productionYear){
        this.power = power;
        this.productionYear = productionYear;
    }

    public int getProductionYear(){
        return productionYear;
    }

    public int getPower(){
        return power;
    }

    void check(){
        if(power>20000 & productionYear>2000){
            System.out.println("Ecological engine.");
        } else {
            System.out.println("Not ecological engine.");
        }
    }

}