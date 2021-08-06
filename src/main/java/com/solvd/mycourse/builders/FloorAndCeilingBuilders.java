package com.solvd.mycourse.builders;

import com.solvd.mycourse.myinterface.IColor;
import com.solvd.mycourse.myinterface.IWholesale;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class FloorAndCeilingBuilders extends Builders implements IColor, IWholesale {
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(FloorAndCeilingBuilders.class));

    public void haveColor(){
        LOGGER.info("Our company can provide you with any colors");
    }
    public void haveWholesale(){
        LOGGER.info("20% discount on interior goods, on weekends");
    }

}
