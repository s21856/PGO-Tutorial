package com.lab07;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Furniture f1 = new Furniture("Table", 20);
        Furniture f2 = new Furniture("Chair",10);
        ArrayList<Furniture> fs1 = new ArrayList<Furniture>();
        fs1.add(f1);
        fs1.add(f2);
        Room r1 = new Room(2,fs1);
        System.out.println(f1.getPrice());
        r1.getAllPrice();
        Room r2 = new Room(2,fs1);
        ArrayList<Room> rs1 = new ArrayList<Room>();
        rs1.add(r1);
        rs1.add(r2);
        House h1 = House.createHouse("PECHERSK");
        h1.addRoom(r1);
        h1.addRoom(rs1);
        System.out.println(h1.getRoomCount());
    }
}