package com.solvd.buildingCompany.builders;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Cashier {
    private static final Logger LOGGER = LogManager.getLogger(Cashier.class);
    Map<String, Double> cart;

    public Cashier() {
        cart = new HashMap<>();
        try(BufferedReader number = new BufferedReader(new InputStreamReader(System.in))) {

            int i = 1;
            while (true){
                LOGGER.info("enter 1 for new product, enter 2 for exit");
                try {
                    i = Integer.parseInt(number.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (i == 1) addGood(number);
                if (i == 2) break;
            }
            LOGGER.info("Total purchase cost: " + countSum());
        } catch (IOException e) {
          LOGGER.error("no found this number", e);
        }

    }

    public void addGood(BufferedReader s) throws IOException{
        LOGGER.info("Enter the name of the product: ");
        String name = s.readLine();
        LOGGER.info("Enter the cost of the product: ");
        double price = Double.parseDouble(s.readLine());

        cart.computeIfPresent(name, (k,v) -> v+price);
        cart.putIfAbsent(name, price);
    }

    public double countSum() {
        double sum = 0;
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }
}

