package com.solvd.mycourse.enums;

public enum BuildersDocument {
    EBOOK("Employment history"),
    PASSPORT("ID CONFIRMATION"),
    CARD("Presence card at work");
    private String doc;

    BuildersDocument(String doc) {
        this.doc = doc;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getDocuments() {
        return this.doc;
    }
}


