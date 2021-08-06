package com.solvd.mycourse.building;

import com.solvd.mycourse.builders.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        public void components() {

            Roof roof = new Roof(256, 4, "metal Tile", "bitominous Tile");
            Stairs stairs = new Stairs(140, 3, "wood");
            Wall wall = new Wall(826, 1, "silicate brick", "ceramic brick");
            Overlap overlap = new Overlap(999, 2, "monolithic Overlap", "wooden Overlap");
            Interior interior = new Interior(100, 4, "pink flowers", "little lamp", "carpet");
            Foundation foundation = new Foundation(181, 4, "", "");
            FloorAndCeiling fc = new FloorAndCeiling(369, 2, "", "");
            DoorAndWindow dw = new DoorAndWindow(180, 8, "", "", 18, 10, 33, 44);

            RoofBuilder rb = new RoofBuilder("", 42, 7, 30, 1000, 5.5, 1);
            InteriorDesigner ind = new InteriorDesigner();
            Electrician electrician = new Electrician();
            Director director = new Director();
            BaseBuilder builder = new BaseBuilder();

            LOGGER.info(.toString());
            LOGGER.info(.toString());
            LOGGER.info(.toString());
            LOGGER.info(.toString());
            LOGGER.info(.toString());
            LOGGER.info(.toString());
            LOGGER.info(Overlap.toString());
            LOGGER.info(Roof.toString());
            LOGGER.info(Wall.toString());
    }
}