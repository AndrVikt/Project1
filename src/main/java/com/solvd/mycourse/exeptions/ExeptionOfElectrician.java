package com.solvd.mycourse.exeptions;

public class ExeptionOfElectrician extends ExeptionForBuilders {
    public ExeptionOfElectrician(int message) { super("\"" + message + "\" It`s impossible to work due to absence of tools.");
    }
}
