package com.solvd.mycourse.building;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Interior extends HomeComponents {
    private String furniture;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Interior.class));

    public Interior (double price, int amount, String furniture){
        super(price, amount);
        this.furniture = furniture;
    }
    public Interior() {
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

}
