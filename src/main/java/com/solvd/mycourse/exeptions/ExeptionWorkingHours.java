package com.solvd.mycourse.exeptions;

public class ExeptionWorkingHours extends ExeptionForBuilders {
    public ExeptionWorkingHours(double message) { super("\"" + message + "\" You must work exactly the specified time");
    }
}
