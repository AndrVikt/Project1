package com.solvd.mycourse.builders;

import com.solvd.mycourse.myinterface.IColor;
import com.solvd.mycourse.myinterface.IWholesale;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FloorAndCeilingBuilders extends Builders implements IColor, IWholesale {
    private static final Logger LOGGER = LogManager.getLogger(FloorAndCeilingBuilders.class);

    public void haveColor(){
        LOGGER.info("Our company can provide you with any colors");
    }
    public void haveWholesale(){
        LOGGER.info("20% discount on interior goods, on weekends");
    }

}
