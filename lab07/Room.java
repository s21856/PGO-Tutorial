package com.lab07;

import java.util.ArrayList;

public class Room {
    private double area;
    private ArrayList<Furniture> furnitures;

    public Room(double area, ArrayList<Furniture> furnitures){
        this.area = area;
        this.furnitures = furnitures;
    }

    public void getAllPrice(){
        double sum=0;
        for(int i=0; i<furnitures.size(); i++){
            System.out.println(furnitures.get(i).getPrice("Yes"));
        }
    }
}