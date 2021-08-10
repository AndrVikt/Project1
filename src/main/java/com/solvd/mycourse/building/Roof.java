package com.solvd.mycourse.building;

import com.solvd.mycourse.myinterface.IColor;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Roof extends HomeComponents implements IColor {
    private String tile;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Roof.class));

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
