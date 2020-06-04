package com.lab07;

import java.util.ArrayList;

public class House {
    private ArrayList<Room> rooms;
    private String address;
    private static int NUMBER_OF_ROOMS;

    ArrayList<Room> rs0 = new ArrayList<Room>();

    private House(){
        rooms = rs0;
    }

    public static House createHouse(String address){
        House house = new House();
        house.address = address;
        return house;
    }

    public void addRoom(Room newRoom){
        if (rooms == rs0){
            rooms.remove(rs0);
            rooms.add(newRoom);
        }
    }

    public void addRoom(ArrayList<Room> newRooms){
        if (rooms == rs0) {
            rooms.remove(rs0);
            rooms.addAll(newRooms);
        }
    }

    public int getRoomCount(){
        NUMBER_OF_ROOMS = rooms.size();
        return NUMBER_OF_ROOMS;
    }


}