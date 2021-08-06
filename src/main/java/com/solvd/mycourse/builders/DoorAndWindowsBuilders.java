package com.solvd.mycourse.builders;

import com.solvd.mycourse.myinterface.IInformation;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class DoorAndWindowsBuilders extends Builders implements IInformation {
    private String roulette;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(DoorAndWindowsBuilders.class));

    public DoorAndWindowsBuilders(String  name, int age, int amount, int constructionTime, double price, double Break, String roulette) {
        super(name, age, amount, constructionTime, price, Break);
        this.roulette = roulette;
    }
    public void haveInformation(){
        LOGGER.info("I can't work without my roulette");
    }

    public String getRoulette() {
        return roulette;
    }

    public void setRoulette(String roulette) {
        this.roulette = roulette;
    }

    @Override
    public String toString() {
        return "DoorAndWindowsBuilders{" +
                "roulette='" + roulette + '\'' +
                '}';
    }
}
