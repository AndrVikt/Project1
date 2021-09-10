package com.solvd.buildingCompany.builders;

public class Check {
    private String name;
    private boolean metalTriangle34;
    private boolean roulette4;

    public Check(String name, boolean metalTriangle, boolean roulette) {
        this.name = name;
        this.metalTriangle34 = metalTriangle;
        this.roulette4 = roulette;
    }
    public boolean metalTriangle34(){
        return metalTriangle34;
    }

    public boolean roulette4(){
        return roulette4;
    }

    @Override
    public String toString(){
        return name;
    }

}
