package com.solvd.mycourse.building;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Roof extends HomeComponents {
    private String metalTile;
    private String bitominousTile;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Roof.class));

    public Roof (double price, int amount, String metalTile, String bitominousTile){
        super(price, amount);
        this.metalTile = metalTile;
        this.bitominousTile = bitominousTile;
    }
    public Roof () {
    }

    public String getMetalTile() {
        return metalTile;
    }

    public void setMetalTile(String metalTile) {
        this.metalTile = metalTile;
    }

    public String getBitominousTile() {
        return bitominousTile;
    }

    public void setBitominousTile(String bitominousTile) {
        this.bitominousTile = bitominousTile;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "metalTile='" + metalTile + '\'' +
                ", bitominousTile='" + bitominousTile + '\'' +
                '}';
    }
}
