package com.solvd.buildingCompany.generics;

public class BuildersLunch <Z>{
        private String forFirst;
        private String forSecond;
        private String drincks;


    public BuildersLunch(String forFirst, String forSecond, String drincks) {
        this.forFirst = forFirst;
        this.forSecond = forSecond;
        this.drincks = drincks;
    }

    public String getForFirst() {
        return forFirst;
    }

    public String getForSecond() {
        return forSecond;
    }

    public String getDrincks() {
        return drincks;
    }
}
