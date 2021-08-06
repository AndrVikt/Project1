package com.solvd.mycourse.building;

import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Foundation extends HomeComponents {
    private String pileFoundation;
    private String tapeMonolithic;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Foundation.class));

    public Foundation (double price, int amount, String pileFoundation, String tapeMonolithic){
        super(price, amount);
        this.pileFoundation = pileFoundation;
        this.tapeMonolithic = tapeMonolithic;
    }
    public Foundation () {
    }
    public String getPileFoundation() {
        return pileFoundation;
    }

    public void setPileFoundation(String pileFoundation) {
        this.pileFoundation = pileFoundation;
    }

    public String getTapeMonolithic() {
        return tapeMonolithic;
    }

    public void setTapeMonolithic(String tapeMonolithic) {
        this.tapeMonolithic = tapeMonolithic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Foundation that = (Foundation) o;
        return Objects.equals(pileFoundation, that.pileFoundation) && Objects.equals(tapeMonolithic, that.tapeMonolithic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pileFoundation, tapeMonolithic);
    }

    @Override
    public String toString() {
        return "Foundation{" +
                "pileFoundation='" + pileFoundation + '\'' +
                ", tapeMonolithic='" + tapeMonolithic + '\'' +
                '}';
    }
}
