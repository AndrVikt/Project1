package com.solvd.buildingCompany.exeptions;

public class ConnectionExeption extends RuntimeException {
    public ConnectionExeption(String message) {
        super(message);
    }
}
