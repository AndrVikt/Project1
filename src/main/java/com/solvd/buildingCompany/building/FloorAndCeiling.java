package com.solvd.buildingCompany.building;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class FloorAndCeiling extends HomeComponents  {
    private String materialsOfFloor;
    private static final Logger LOGGER = LogManager.getLogger(FloorAndCeiling.class);

    public FloorAndCeiling (double price, String materialsOfFloor){
        super(price);
        this.materialsOfFloor = materialsOfFloor;
    }
    public FloorAndCeiling () {
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
