package com.solvd.mycourse.building;

import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Overlap extends HomeComponents {
    private String overlap;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Overlap.class));

    public Overlap (double price, int amount, String overlap){
        super(price, amount);
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
