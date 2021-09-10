package com.solvd.buildingCompany.builders;

import com.solvd.buildingCompany.enums.Components;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Report {
    private static final Logger LOGGER = (Logger) LogManager.getLogger(Report.class);
    public Builder construction(Components type) {
        Builder builder = null;

        switch (type) {
            case FOUNDATION:
                builder = new FoundationBuilders();
                break;
            case ROOF:
                builder = new RoofBuilder();
                break;
            case ELECTRICITY:
                builder = new Electrician();
                break;
            case FLOOR:
            case CEILING:
                builder = new FloorAndCeilingBuilders();
                break;
        }

        builder.measureTheArea();
        builder.buyMaterials();
        builder.build();

        LOGGER.info("This part of the house is finished!");
        return builder;
    }
}
