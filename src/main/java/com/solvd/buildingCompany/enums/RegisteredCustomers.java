package com.solvd.buildingCompany.enums;

public enum RegisteredCustomers {
    ID("Customers ID"),
    NAME("Name of registered customers"),
    DOCUMENT_NUMBER("Number of the construction contract");
    private String info;

    RegisteredCustomers(String info) {
        this.info = info;
    }
    public String getInfo() {
        return this.info;
    }
}
