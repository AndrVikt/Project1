package com.solvd.mycourse.builders;

import com.solvd.mycourse.building.Interior;
import com.solvd.mycourse.myinterface.ICalculator;
import com.solvd.mycourse.myinterface.IColor;
import com.solvd.mycourse.myinterface.ICompanyNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class InteriorDesigner extends Interior implements IColor, ICompanyNumber {
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(InteriorDesigner.class));

    public InteriorDesigner(){
    }

    @Override
    public void haveCompanyNumber() {
        LOGGER.info("you can find out the designer's number from the company's director");
    }

    @Override
    public void haveColor() {
       LOGGER.info("You can choose any color for your interior");
    }

    public InteriorDesigner(double price, int amount, String furniture) {
        super(price, amount, furniture);
    }
    public void furniture(){
        LOGGER.info("Our designer can offer you such furniture");
        List<Interior> inList = new ArrayList<>();
        inList.add(new Interior(648 , 1,  "Bed"));
        inList.add(new Interior(900, 1,  "armchair"));
        inList.add(new Interior(805.5, 1, "wardrobe"));
        inList.add(new Interior(200.10, 1, "lamp"));
        inList.add(new Interior(120, 1, "wallpaper"));
        inList.add(new Interior(300.99, 1, "carpet"));
        inList.add(new Interior(470, 1, "table"));
        inList.add(new Interior(1080, 1,  "sofa"));
    }
    public static void furnitureList(List<Interior> comp) {
        for (Interior components : comp) {
            System.out.println(components);
        }
        }
    public static void summ(List<Interior> res){
            double sum = 0;
            for (Interior component : res){
                sum += component.getPrice();
                return;
        }
    }
}
