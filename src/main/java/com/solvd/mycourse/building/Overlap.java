package com.solvd.mycourse.building;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Overlap extends HomeComponents {
    private String monolithicOverlap;
    private String woodenOverlap;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Overlap.class));

    public Overlap (double price, int amount, String monolithicOverlap, String woodenOverlap){
        super(price, amount);
        this.monolithicOverlap = monolithicOverlap;
        this.woodenOverlap = woodenOverlap;
    }
    public Overlap () {
    }


    public String getMonolithicOverlap() {
        return monolithicOverlap;
    }

    public void setMonolithicOverlap(String monolithicOverlap) {
        this.monolithicOverlap = monolithicOverlap;
    }

    public String getWoodenOverlap() {
        return woodenOverlap;
    }

    public void setWoodenOverlap(String woodenOverlap) {
        this.woodenOverlap = woodenOverlap;
    }

    @Override
    public String toString() {
        return "Overlap{" +
                "monolithicOverlap='" + monolithicOverlap + '\'' +
                ", woodenOverlap='" + woodenOverlap + '\'' +
                '}';
    }
}
