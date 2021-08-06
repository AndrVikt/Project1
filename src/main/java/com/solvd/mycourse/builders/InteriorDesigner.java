package com.solvd.mycourse.builders;

import com.solvd.mycourse.building.Interior;

import java.util.Arrays;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class InteriorDesigner extends Interior {
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(InteriorDesigner.class));

    public InteriorDesigner(){
    }

    public InteriorDesigner(double price, int amount, String wallpaper, String lamp, String furniture) {
        super(price, amount, wallpaper, lamp, furniture);
    }
    private List<Interior> interiorList = Arrays.asList(new Interior("wallpaper Flowers", "Big lamp", "Bed"),
    new Interior("wallpaper Forest", "Children`s lamp", "Armchair"));

    public List<Interior> getInteriorList() {
        return interiorList;
    }
    public void setInteriorList(List<Interior> interiorList) {
        this.interiorList = interiorList;
    }


}
