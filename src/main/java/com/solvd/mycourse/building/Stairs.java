package com.solvd.mycourse.building;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Stairs extends HomeComponents {
    private String matelialOfStairs;
    private static final Logger LOGGER = LogManager.getLogger(Stairs.class);

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
