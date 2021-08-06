package com.solvd.mycourse.building;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Wall extends HomeComponents {
    private String silicateBrick;
    private String ceramicBrick;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Wall.class));

    public Wall (double price, int amount, String silicateBrick, String ceramicBrick){
        super(price, amount);
        this.silicateBrick = silicateBrick;
        this.ceramicBrick = ceramicBrick;
    }
    public Wall () {
    }
    public String getSilicateBrick() {
        return silicateBrick;
    }

    public void setSilicateBrick(String silicateBrick) {
        this.silicateBrick = silicateBrick;
    }

    public String getCeramicBrick() {
        return ceramicBrick;
    }

    public void setCeramicBrick(String ceramicBrick) {
        this.ceramicBrick = ceramicBrick;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "silicateBrick='" + silicateBrick + '\'' +
                ", ceramicBrick='" + ceramicBrick + '\'' +
                '}';
    }
}
