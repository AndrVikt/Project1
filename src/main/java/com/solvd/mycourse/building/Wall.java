package com.solvd.mycourse.building;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Wall extends HomeComponents {
    private String brick;

    private static final Logger LOGGER = LogManager.getLogger(Wall.class);

    public Wall (double price, int amount, String brick){
        super(price, amount);
        this.brick = brick;
    }
    public Wall () {
    }
    public String getBrick() {
        return brick;
    }

    public void setBrick(String brick) {
        this.brick = brick;
    }

}
