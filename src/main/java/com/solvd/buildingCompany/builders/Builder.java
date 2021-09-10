package com.solvd.buildingCompany.builders;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;
import java.util.function.Predicate;

public abstract class Builder {
    private String name;
    private int age;
    private int amount;
    private int constructionTime;
    private double price;
    private double Break;
    private static final Logger LOGGER = LogManager.getLogger(Builder.class);

    public Builder(String  name, int age, int amount, int constructionTime, double price, double Break){
        this.name = name;
        this.age = age;
        this.amount = amount;
        this.constructionTime = constructionTime;
        this.price = price;
        this.Break = Break;
    }
    public Builder() {
    }

    public void measureTheArea(){
    }
    public void buyMaterials(){
    }
    public void build(){
    }

    public void giveBreak(double Break) {
        LOGGER.info("Your break," + this.name + ", starts at" + this.Break + "o`clock");
    }

    Predicate<Integer> trueAge = age -> getAge() >= 25;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getConstructionTime() {
        return constructionTime;
    }

    public void setConstructionTime(int constructionTime) {
        this.constructionTime = constructionTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBreak() {
        return Break;
    }

    public void setBreak(double Break) {
        this.Break = Break;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Builder builders = (Builder) o;
        return age == builders.age && amount == builders.amount && constructionTime == builders.constructionTime && Double.compare(builders.price, price) == 0 && Objects.equals(name, builders.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, amount, constructionTime, price);
    }

    @Override
    public String toString() {
        return "Builders{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", amount=" + amount +
                ", constructionTime=" + constructionTime +
                ", price=" + price +
                ", Break=" + Break +
                ", trueAge=" + trueAge +
                '}';
    }
}
