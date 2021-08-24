package com.solvd.mycourse.building;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Interior extends HomeComponents {
    private String furniture;
    private static final Logger LOGGER = LogManager.getLogger(Interior.class);

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
