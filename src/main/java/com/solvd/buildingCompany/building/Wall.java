package com.solvd.buildingCompany.building;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Predicate;

public class Wall extends HomeComponents {
    private String brick;

    private static final Logger LOGGER = LogManager.getLogger(Wall.class);

    public Wall (double price, String brick){
        super(price);
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
