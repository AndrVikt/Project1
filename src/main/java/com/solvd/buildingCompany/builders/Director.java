package com.solvd.buildingCompany.builders;

import com.solvd.buildingCompany.myinterface.ICompanyNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Director extends Builder implements ICompanyNumber {
    private int idDocuments;
    private final static String LAND_OWNERSHIP = "your land ownership";
    private final static String PASSPORT = "your passport data";
    private final static String CONTRACT = "your new contract";
    private static final Logger LOGGER = LogManager.getLogger(Director.class);

    public Director(String  name, int age, int amount, int constructionTime, double price, double Break, int idDocuments) {
        super(name, age, amount, constructionTime, price, Break);
        this.idDocuments = idDocuments;
    }

    public void Documents() {
        LOGGER.info( "We will not provide services to you if you do not have these documents: " + LAND_OWNERSHIP + ", " + PASSPORT +
                ", " + CONTRACT );
    }

    @Override
    public void haveCompanyNumber() {
        LOGGER.info("Builders mobile numbers");
        LOGGER.info("Base builders 0691236548" +
                "Electrician 0956842375" + "Roof builder 0986541235" + "Floor builder 0987456321" + "Door builder 0975463215" + "Designer 0659874563");
    }

    public int getIdDocuments() {
        return idDocuments;
    }

    public void setIdDocuments(int idDocuments) {
        this.idDocuments = idDocuments;
    }


}
