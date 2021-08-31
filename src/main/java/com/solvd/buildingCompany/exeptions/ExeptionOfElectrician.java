package com.solvd.buildingCompany.exeptions;

public class ExeptionOfElectrician extends ExeptionForBuilders {
    public ExeptionOfElectrician(int message) { super("\"" + message + "\" It`s impossible to work due to absence of tools.");
    }
}
