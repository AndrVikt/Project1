package com.solvd.mycourse.builders;

import com.solvd.mycourse.exeptions.ExeptionWorkingHours;
import jdk.jshell.JShell;

import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class BaseBuilder extends Builders {
    private double workingHours;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(BaseBuilder.class));
    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public BaseBuilder(double workingHours) {
        if (workingHours == 0) {
            throw new ExeptionWorkingHours(workingHours);
        }
        this.workingHours = workingHours;
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
        BaseBuilder that = (BaseBuilder) o;
        return Double.compare(that.workingHours, workingHours) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(workingHours);
    }


}
