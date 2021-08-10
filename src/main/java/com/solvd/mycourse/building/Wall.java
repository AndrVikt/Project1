package com.solvd.mycourse.building;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Wall extends HomeComponents {
    private String brick;

    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Wall.class));

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
