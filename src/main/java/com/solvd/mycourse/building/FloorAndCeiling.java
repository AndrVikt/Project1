package com.solvd.mycourse.building;

import com.solvd.mycourse.myinterface.IColor;

import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class FloorAndCeiling extends HomeComponents  {
    private String materialsOfFloor;
    private String materialsOfCeiling;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(FloorAndCeiling.class));

    public FloorAndCeiling (double price, int amount, String materialsOfFloor, String materialsOfCeiling){
        super(price, amount);
        this.materialsOfFloor = materialsOfFloor;
        this.materialsOfCeiling = materialsOfCeiling;
    }
    public FloorAndCeiling () {
    }


    public String getMaterialsOfFloor() {
        return materialsOfFloor;
    }

    public void setMaterialsOfFloor(String materialsOfFloor) {
        this.materialsOfFloor = materialsOfFloor;
    }

    public String getMaterialsOfCeiling() {
        return materialsOfCeiling;
    }

    public void setMaterialsOfCeiling(String materialsOfCeiling) {
        this.materialsOfCeiling = materialsOfCeiling;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FloorAndCeiling that = (FloorAndCeiling) o;
        return Objects.equals(materialsOfFloor, that.materialsOfFloor) && Objects.equals(materialsOfCeiling, that.materialsOfCeiling);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), materialsOfFloor, materialsOfCeiling);
    }

    @Override
    public String toString() {
        return "FloorAndCeiling{" +
                "materialsOfFloor='" + materialsOfFloor + '\'' +
                ", materialsOfCeiling='" + materialsOfCeiling + '\'' +
                '}';
    }
}
