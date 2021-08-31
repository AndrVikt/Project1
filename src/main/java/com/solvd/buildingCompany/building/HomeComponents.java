package com.solvd.buildingCompany.building;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class HomeComponents {
    private double price;
    private static final Logger LOGGER = LogManager.getLogger(HomeComponents.class);
    public HomeComponents(double price){
        this.price = price;
   }

   public HomeComponents(){
        }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
