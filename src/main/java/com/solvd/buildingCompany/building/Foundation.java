package com.solvd.buildingCompany.building;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Foundation extends HomeComponents {
    private String foundation;
    private static final Logger LOGGER = LogManager.getLogger(Foundation.class);

    public Foundation (double price, String foundation){
        super(price);
        this.foundation = foundation;
    }
    public Foundation () {
    }
    public String getPileFoundation() {
        return foundation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Foundation that = (Foundation) o;
        return Objects.equals(foundation, that.foundation) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foundation);
    }

}
