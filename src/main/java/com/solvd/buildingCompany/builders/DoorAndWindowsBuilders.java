package com.solvd.buildingCompany.builders;

import com.solvd.buildingCompany.myinterface.IInformation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DoorAndWindowsBuilders extends Builder implements IInformation {
    private static final Logger LOGGER = LogManager.getLogger(DoorAndWindowsBuilders.class);

    public DoorAndWindowsBuilders(String  name, int age, int amount, int constructionTime, double price, double Break, boolean roulette, boolean metalTriangle) {
        super(name, age, amount, constructionTime, price, Break);
    }

    public void haveInformation(){
        LOGGER.info("I can't work without my roulette");
    }

}
