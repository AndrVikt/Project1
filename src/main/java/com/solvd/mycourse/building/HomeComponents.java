package com.solvd.mycourse.building;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public abstract class HomeComponents {
    private double price;
    private int amount;
    private static final Logger LOGGER = LogManager.getLogger(HomeComponents.class);
    public HomeComponents(double price, int amount){
        this.price = price;
        this.amount = amount;
   }

   public HomeComponents(){
        }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeComponents that = (HomeComponents) o;
        return Double.compare(that.price, price) == 0 && amount == that.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, amount);
    }

    @Override
    public String toString() {
        return "HomeComponents{" +
                "price=" + price +
                ", amount=" + amount +
                '}';
    }
}
