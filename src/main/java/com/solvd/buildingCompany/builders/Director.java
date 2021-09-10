package com.solvd.buildingCompany.builders;

import com.solvd.buildingCompany.myinterface.ICompanyNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.time.DayOfWeek;

public class Director extends Builder implements ICompanyNumber {
    private int idDocuments;
    private final static String LAND_OWNERSHIP = "your land ownership";
    private final static String PASSPORT = "your passport data";
    private final static String CONTRACT = "your new contract";
    private Weekend calendar;
    private static final Logger LOGGER = (Logger) LogManager.getLogger(Director.class);

    public Director(String name, int age, int amount, int constructionTime, double price, double Break, int idDocuments) {
        super(name, age, amount, constructionTime, price, Break);
        this.idDocuments = idDocuments;
    }

    public void Documents() {
        LOGGER.info("We will not provide services to you if you do not have these documents: " + LAND_OWNERSHIP + ", " + PASSPORT +
                ", " + CONTRACT);
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

    public void wakeUp() {

        if (this.calendar.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Foundation builders work today");
        } else {
            if (this.calendar.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println("Electricians work on Monday");
            } else {
                if (this.calendar.getDayOfWeek() == DayOfWeek.TUESDAY) {
                    System.out.println("Today they make floors, ceilings, insert windows and doors");
                } else {
                    if (this.calendar.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                        System.out.println("Roof builders work today");
                    } else {
                        if (this.calendar.getDayOfWeek() == DayOfWeek.THURSDAY) {
                            System.out.println("Designer work on Thursday");
                        } else {
                            System.out.println("Day off for all employees");
                        }
                    }
                }
            }
        }
    }
}
