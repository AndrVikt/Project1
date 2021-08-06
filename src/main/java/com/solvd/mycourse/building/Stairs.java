package com.solvd.mycourse.building;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Stairs extends HomeComponents {
    private String matelialOfStairs;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Stairs.class));

    public Stairs (double price, int amount, String matelialOfStairs){
        super(price, amount);
        this.matelialOfStairs = matelialOfStairs;
    }
    public Stairs () {
    }
    public String getMatelialOfStairs() {
        return matelialOfStairs;
    }

    public void setMatelialOfStairs(String matelialOfStairs) {
        this.matelialOfStairs = matelialOfStairs;
    }

    @Override
    public String toString() {
        return "Stairs{" +
                "matelialOfStairs='" + matelialOfStairs + '\'' +
                '}';
    }
}
