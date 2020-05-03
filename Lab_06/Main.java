package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //task1

        Multiplier multiplier = new Multiplier();
        Adder adder = new Adder();

        int var1 = 5;
        int var2 = 3;
        int var3 = 2;
        int var4 = 4;
        double var5 = 2.4;
        double var6 = 1.8;
        BigDecimal var7 = new BigDecimal(92.2);
        BigDecimal var8 = new BigDecimal(4882.23);
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(5);
        arr1.add(3);
        arr1.add(2);
        arr1.add(4);

        System.out.println(multiplier.multiply(var1, var2));
        System.out.println(multiplier.multiply(var1, var2, var3, var4));

        System.out.println(multiplier.multiply(var5,var6));
        System.out.println(multiplier.multiply(var7,var8));

        System.out.println(multiplier.multiply(arr1));

        System.out.println(adder.add(var1,var2));
        System.out.println(adder.add(var7,var8));


        //task2

        Address address = new Address();

        System.out.println(address.createAddress("Ukraine"));
        System.out.println(address.createAddress("Ukraine", "Kiev"));
        System.out.println(address.createAddress("Ukraine", "Kiev", "03-100"));
        System.out.println(address.createAddress("Ukraine", "Kiev", "03-100", "Pechersk"));
        System.out.println(address.createAddress("Ukraine", "Kiev", "03-100", "Pechersk", 77));






    }
}