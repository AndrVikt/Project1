package com.solvd.buildingCompany.builders;

import com.solvd.buildingCompany.exeptions.ExeptionWorkingHours;
import com.solvd.buildingCompany.myinterface.ICompanyNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class FoundationBuilders extends Builder implements ICompanyNumber {
    private double workingHours;
    private static final Logger LOGGER = LogManager.getLogger(FoundationBuilders.class);

    public FoundationBuilders() {
    }

    public void BaseBuilder(double workingHours) {
        this.workingHours = workingHours;
    }

    public FoundationBuilders(double workingHours) {
        if (workingHours == 0) {
            throw new ExeptionWorkingHours(workingHours);
        }
        this.workingHours = workingHours;
    }

    @Override
    public void haveCompanyNumber() {
        LOGGER.info("The number of the builder of the foundation can be found out from the director of the company");
    }

    public void giveBreakForFood (double time, Builder baseWorker)  {
        if (time == 13.30) {
            baseWorker.giveBreak(baseWorker.getBreak());
        } else {
            LOGGER.info(" " + getName() + "Your break has not started yet");
        }
    }
    public double getWorkingHouse() {
        return workingHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoundationBuilders that = (FoundationBuilders) o;
        return Double.compare(that.workingHours, workingHours) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(workingHours);
    }


}
