package com.solvd.mycourse.building;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
import java.util.Scanner;

public class FloorAndCeiling extends HomeComponents  {
    private String materialsOfFloor;
    private static final Logger LOGGER = LogManager.getLogger(FloorAndCeiling.class);

    public FloorAndCeiling (double price, int amount, String materialsOfFloor){
        super(price, amount);
        this.materialsOfFloor = materialsOfFloor;
    }
    public FloorAndCeiling () {
    }
    public void yourPrice(){

        double s = getAmount();
        double price = getPrice();
        var lambdaContext = new Object() {
        double yourprice;
        };
        input.chars().forEach(c -> lambdaContext.yourprice = s * price;
        LOGGER.info("the price of goods per area");
        }


    public String getMaterialsOfFloor() {
        return materialsOfFloor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FloorAndCeiling that = (FloorAndCeiling) o;
        return Objects.equals(materialsOfFloor, that.materialsOfFloor);
                //&& Objects.equals(materialsOfCeiling, that.materialsOfCeiling);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), materialsOfFloor);
    }

}
