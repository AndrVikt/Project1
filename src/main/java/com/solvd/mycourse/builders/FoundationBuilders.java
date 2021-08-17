package com.solvd.mycourse.builders;

import com.solvd.mycourse.exeptions.ExeptionWorkingHours;
import com.solvd.mycourse.myinterface.ICompanyNumber;

import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class FoundationBuilders extends Builders implements ICompanyNumber {
    private double workingHours;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(FoundationBuilders.class));
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

    public void giveBreakForFood (double time, Builders baseWorker) {
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
