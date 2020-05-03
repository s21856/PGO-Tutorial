package com.company;

import java.math.BigDecimal;

public class Adder {

    public int add(int var1, int var2) {
        return var1 + var2;
    }

    public BigDecimal add(BigDecimal var1, BigDecimal var2) {
        return var1.add(var2);
    }

}