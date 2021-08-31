package com.solvd.buildingCompany.building;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Overlap extends HomeComponents {
    private String overlap;
    private static final Logger LOGGER = LogManager.getLogger(Overlap.class);

    public Overlap (double price, String overlap){
        super(price);
        this.overlap = overlap;
    }
    public Overlap () {
    }

    public String getOverlap() {
        return overlap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Overlap overlap1 = (Overlap) o;
        return Objects.equals(overlap, overlap1.overlap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), overlap);
    }
}
