package com.solvd.buildingCompany.builders;

import com.solvd.buildingCompany.myinterface.ICheckTools;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tools {
    private static final Logger LOGGER = LogManager.getLogger(Builder.class);
    private static void printTest(Check tool, ICheckTools check){
        if(check.test(tool)){
            LOGGER.info(tool);
        }
    }

    public static void main(String[] args) {
        Check Tool1 = new Check("Tool for floor", true, true);
        Check Tool2 = new Check("Tool for all", true, false);
        printTest(Tool1, c -> c.metalTriangle34());
        printTest(Tool1, c -> c.roulette4());
        printTest(Tool2, c -> c.metalTriangle34());
        printTest(Tool2, c -> c.roulette4());
    }
}

