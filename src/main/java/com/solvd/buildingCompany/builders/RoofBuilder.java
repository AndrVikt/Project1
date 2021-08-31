package com.solvd.buildingCompany.builders;

import com.solvd.buildingCompany.exeptions.ExeptionOfElectrician;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RoofBuilder extends Builder {
    private int saferyRope;
    private static final Logger LOGGER = LogManager.getLogger(RoofBuilder.class);

    public RoofBuilder(String  name, int age, int amount, int constructionTime, double price, double Break, int saferyRope) {
        super(name, age, amount, constructionTime, price, Break);
        this.saferyRope = saferyRope;
    }
    public RoofBuilder(int saferyRope) {
        if (saferyRope == 0) {
            throw new ExeptionOfElectrician(saferyRope);
        }
        this.saferyRope = saferyRope;
    }

    public int getSaferyRope() {
        return saferyRope;
    }

    public void setSaferyRope(int saferyRope) {
        this.saferyRope = saferyRope;
    }

    @Override
    public String toString() {
        return "RoofBuilder{" +
                "saferyRope=" + saferyRope +
                '}';
    }
}

