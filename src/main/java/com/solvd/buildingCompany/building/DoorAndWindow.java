package com.solvd.buildingCompany.building;

import com.solvd.buildingCompany.exeptions.ExeptionOfDoor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class DoorAndWindow extends HomeComponents {
    private double heightDoor;
    private double widthDoor;
    private double heightWindow;
    private double widthWindow;
    private String materialOfDoor;
    private String materialOfWindow;
    private static final Logger LOGGER = LogManager.getLogger(DoorAndWindow.class);

    public DoorAndWindow (double price, String materialOfDoor, String materialOfWindow, double heightDoor, double widthDoor,
                          double heightWindow, double widthWindow){
        super(price);
        this.materialOfDoor = materialOfDoor;
        this.materialOfWindow = materialOfWindow;
        this.heightDoor = heightDoor;
        this.widthDoor = widthDoor;
        this.heightWindow = heightWindow;
        this.widthWindow = widthWindow;
    }
    public DoorAndWindow(int heightDoor) {
        if (heightDoor == 0) {
            throw new ExeptionOfDoor(heightDoor);
        }
        this.heightDoor = heightDoor;
    }

    public DoorAndWindow () {
    }

    public void area(){
        Predicate<Integer> predicate = heightWindow -> heightWindow > widthWindow;
        LOGGER.info(predicate.equals(heightWindow));
        Predicate<Integer> predicate2 = heightDoor -> heightDoor > widthDoor;
        LOGGER.info(predicate.equals(heightDoor));
        BinaryOperator<Integer> binaryOperator = (x, y) -> x*y;
        LOGGER.info(String.valueOf(heightDoor),widthDoor);
        LOGGER.info(String.valueOf(heightWindow),widthWindow);

    }

    public String getMaterialOfDoor() {
        return materialOfDoor;
    }

    public void setMaterialOfDoor(String materialOfDoor) {
        this.materialOfDoor = materialOfDoor;
    }

    public String getMaterialOfWindow() {
        return materialOfWindow;
    }

    public void setMaterialOfWindow(String materialOfWindow) {
        this.materialOfWindow = materialOfWindow;
    }

    public double getHeightWindow() {
        return heightWindow;
    }

    public void setHeightWindow(double widthWindow) {
        this.widthWindow = widthWindow;
    }

    public double getWidthWindow() {
        return widthWindow;
    }

    public void setWidthWindow(double widthWindow) {
        this.widthWindow = widthWindow;
    }

    public double getHeightDoor() {
        return heightWindow;
    }

    public void setHeightDoor(double widthDoor) {
        this.widthDoor = widthDoor;
    }

    public double getWidthDoor() {
        return widthDoor;
    }

    public void setWidthDoor(double widthDoor) {
        this.widthDoor = widthDoor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DoorAndWindow that = (DoorAndWindow) o;
        return Double.compare(that.heightDoor, heightDoor) == 0 && Double.compare(that.widthDoor, widthDoor) == 0 && Double.compare(that.heightWindow, heightWindow) == 0 && Double.compare(that.widthWindow, widthWindow) == 0 && Objects.equals(materialOfDoor, that.materialOfDoor) && Objects.equals(materialOfWindow, that.materialOfWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), heightDoor, widthDoor, heightWindow, widthWindow, materialOfDoor, materialOfWindow);
    }

    @Override
    public String toString() {
        return "DoorAndWindow{" +
                "heightDoor=" + heightDoor +
                ", widthDoor=" + widthDoor +
                ", heightWindow=" + heightWindow +
                ", widthWindow=" + widthWindow +
                ", materialOfDoor='" + materialOfDoor + '\'' +
                ", materialOfWindow='" + materialOfWindow + '\'' +
                '}';
    }
}
