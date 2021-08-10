package com.solvd.mycourse.builders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Cashier {

    Map<String, Double> cart;
    BufferedReader bf;;

    public Cashier() throws NumberFormatException, IOException {
        cart = new HashMap<>();
        bf = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        while (true){
            System.out.println("enter 1 for new product, enter 2 for exit");
            try {
                i = Integer.parseInt(bf.readLine());
            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (i == 1) addGood();
            if (i == 2) break;
        }
        System.out.println("Total purchase cost: " + countSum());
    }

    public void addGood() throws NumberFormatException, IOException{
        System.out.println("Enter the name of the product: ");
        String name = bf.readLine();
        System.out.println("Enter the cost of the product: ");
        double price = Double.parseDouble(bf.readLine());

        cart.computeIfPresent(name, (k,v) -> v+price);
        cart.putIfAbsent(name, price);
    }

    //подсчитать общую сумму
    public double countSum(){
        double sum = 0;
        for(Map.Entry<String, Double> entry : cart.entrySet()) {
            sum += entry.getValue();
        }
        if (sum > 1000) sum *= 0.9;
        return sum;
    }
}

