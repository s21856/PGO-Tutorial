package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Multiplier {

    public int multiply(int var1, int var2) {

        return var1 * var2;

    }

    public int multiply(int var1, int var2, int var3, int var4) {

        return multiply(var1, var2) * multiply(var3, var4);

    }

    public double multiply(double d1, double d2) {

        return d1 * d2;

    }

    public BigDecimal multiply(BigDecimal b1, BigDecimal b2) {

        return b1.multiply(b2);

    }

    public int multiply(ArrayList<Integer> arr) {

        Integer res = 1;
        for (int i = 0; i< arr.size(); i++){
            res *= arr.get(i);
        }
        return res;

    }


}