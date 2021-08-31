package com.solvd.buildingCompany.enums;

public enum  ConstructionStores {
    STORE_1("All foundation products"),
    STORE_2("Roofing products"),
    STORE_3("Comfortable windows and doors");

    private String st;

    ConstructionStores(String st) {
        this.st = st;
    }
    public String getSt() {
        return st;
    }
}
