package com.solvd.buildingCompany.enums;

public enum BuildersDocument {
    EBOOK("Employment history"),
    PASSPORT("ID CONFIRMATION"),
    CARD("Presence card at work");

    private String doc;
    public String getDoc() {
        return doc;
    }

    BuildersDocument(String doc) {
        this.doc = doc;
    }
}


