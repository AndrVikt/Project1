package com.solvd.mycourse.building;

import com.solvd.mycourse.myinterface.IColor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Roof extends HomeComponents implements IColor {
    private String tile;
    private static final Logger LOGGER = LogManager.getLogger(Roof.class);

    public Roof (double price, int amount, String tile){
        super(price, amount);
        this.tile = tile;
    }
    public Roof() {
    }

    @Override
    public void haveColor() {
        LOGGER.info("we have 3 colors for the roof: red green and brown ");
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String metalTile) {
        this.tile = metalTile;
    }


}
