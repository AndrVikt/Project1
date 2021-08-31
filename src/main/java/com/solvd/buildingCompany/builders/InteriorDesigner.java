package com.solvd.buildingCompany.builders;

import com.solvd.buildingCompany.building.Interior;
import com.solvd.buildingCompany.myinterface.IColor;
import com.solvd.buildingCompany.myinterface.ICompanyNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class InteriorDesigner implements IColor, ICompanyNumber {
    private String name;
    private double price;
    private static final Logger LOGGER = LogManager.getLogger(InteriorDesigner.class);
    public InteriorDesigner(double price, String name) {

    }
    public InteriorDesigner() {
    }

    @Override
    public void haveCompanyNumber() {
        LOGGER.info("you can find out the designer's number from the company's director");
    }

    @Override
    public void haveColor() {
        LOGGER.info("You can choose any color for your interior");
    }

    public void furniture(){
        LOGGER.info("Our designer can offer you such furniture");
        ArrayList<InteriorDesigner> ints = new ArrayList<>();
        ints.add(new InteriorDesigner(222,"Bed"));
        ints.add(new InteriorDesigner(900, "armchair"));
        ints.add(new InteriorDesigner(805.5, "wardrobe"));
        ints.add(new InteriorDesigner(200.10, "lamp"));
        ints.add(new InteriorDesigner(120, "wallpaper"));
        ints.add(new InteriorDesigner(300.99, "carpet"));
        ints.add(new InteriorDesigner(470, "table"));
        ints.add(new InteriorDesigner(1080, "sofa"));

        ints.forEach(interiorDesigner -> LOGGER.info(interiorDesigner));
    }

}
