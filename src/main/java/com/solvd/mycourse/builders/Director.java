package com.solvd.mycourse.builders;

import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Director extends Builders{
    private int idDocuments;
    private final static String LAND_OWNERSHIP = "your land ownership";
    private final static String PASSPORT = "your passport data";
    private final static String CONTRACT = "your new contract";
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Director.class));

    public Director(String  name, int age, int amount, int constructionTime, double price, double Break, int idDocuments) {
        super(name, age, amount, constructionTime, price, Break);
        this.idDocuments = idDocuments;
    }

    public void Documents() {
        LOGGER.info("We will not provide services to you if you do not have these documents: " + LAND_OWNERSHIP + ", " + PASSPORT +
                ", " + CONTRACT );
    }

    public int getIdDocuments() {
        return idDocuments;
    }

    public void setIdDocuments(int idDocuments) {
        this.idDocuments = idDocuments;
    }


}
