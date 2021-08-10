package com.solvd.mycourse.building;

import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Foundation extends HomeComponents {
    private String foundation;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Foundation.class));

    public Foundation (double price, int amount, String foundation){
        super(price, amount);
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
