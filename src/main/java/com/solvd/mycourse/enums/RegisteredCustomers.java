package com.solvd.mycourse.enums;

public enum RegisteredCustomers {
    ID("Customers ID"),
    NAME("Name of registered customers"),
    DOCUMENT_NUMBER("Number of the construction contract");
    private String doc;

    RegisteredCustomers(String doc) {
        this.doc = doc;
    }
    public String getDocuments() {
        return this.doc;
    }
}
