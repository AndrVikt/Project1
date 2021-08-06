package com.solvd.mycourse.building;

import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Interior extends HomeComponents {
    private String wallpaper;
    private String lamp;
    private String furniture;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Interior.class));

    public Interior (double price, int amount, String wallpaper, String lamp, String furniture){
        super(price, amount);
        this.wallpaper = wallpaper;
        this.lamp = lamp;
        this.furniture = furniture;
    }
    public Interior(String wallpaper, String lamp, String furniture) {
    }

    public Interior() {
    }

    public String getWallpaper() {
        return wallpaper;
    }

    public void setWallpaper(String wallpaper) {
        this.wallpaper = wallpaper;
    }

    public String getLamp() {
        return lamp;
    }

    public void setLamp(String lamp) {
        this.lamp = lamp;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Interior interior = (Interior) o;
        return Objects.equals(wallpaper, interior.wallpaper) && Objects.equals(lamp, interior.lamp) && Objects.equals(furniture, interior.furniture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wallpaper, lamp, furniture);
    }

    @Override
    public String toString() {
        return "Interior{" +
                "wallpaper='" + wallpaper + '\'' +
                ", lamp='" + lamp + '\'' +
                ", furniture='" + furniture + '\'' +
                '}';
    }
}
