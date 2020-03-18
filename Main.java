package com.company;
import com.company.Airplane;
import com.company.Engine;

public class Main {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Boeing", 20000);
        Engine e1 = new Engine(20000,2000);
        a1.setEngine(e1);
        // Test
        System.out.println(a1.getBrand());
        a1.setNumberOfSeats(10);
        System.out.println(a1.getProductionYear());
        System.out.println(a1.getPower());
        a1.check();
    }
}
