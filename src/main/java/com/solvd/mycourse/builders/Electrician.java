package com.solvd.mycourse.builders;

import com.solvd.mycourse.exeptions.ExeptionOfElectrician;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Electrician extends Builders{
    private int tools;
    private String cable;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Electrician.class));

    public Electrician(String  name, int age, int amount, int constructionTime, double price, double Break, int tools, String cable) {
        super(name, age, amount, constructionTime, price, Break);
        this.tools = tools;
        this.cable = cable;
    }
    public Electrician(int tools) {
        if (tools == 0) {
            throw new ExeptionOfElectrician(tools);
        }
        this.tools = tools;
    }

    public int getTools() {
        return tools;
    }

    public void setTools(int tools) {
        this.tools = tools;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }
}
