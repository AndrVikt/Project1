package com.solvd.mycourse.building;


import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public abstract class HomeComponents {
    private double price;
    private int amount;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(HomeComponents.class));
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
