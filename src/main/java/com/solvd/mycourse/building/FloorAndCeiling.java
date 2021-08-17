package com.solvd.mycourse.building;

import com.solvd.mycourse.myinterface.ICalculator;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class FloorAndCeiling extends HomeComponents  {
    private String materialsOfFloor;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(FloorAndCeiling.class));

    public FloorAndCeiling (double price, int amount, String materialsOfFloor){
        super(price, amount);
        this.materialsOfFloor = materialsOfFloor;
    }
    public FloorAndCeiling () {
    }
    public void yourPrice(){
        Scanner input = new Scanner(System.in);
        double s = getAmount();
        double price = getPrice();
        double yourprice;
        for (int i = 0; i < 600; i++){
            yourprice = s * price;
        LOGGER.info("the price of goods per area");
        }
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
