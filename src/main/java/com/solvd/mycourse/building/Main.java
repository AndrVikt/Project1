package com.solvd.mycourse.building;

import com.solvd.mycourse.generics.BuildersLunch;
import com.solvd.mycourse.generics.DocumentsOfBuilders;
import com.solvd.mycourse.generics.RegistratedClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.security.auth.login.AccountException;
import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        RegistratedClient<Integer> acc1 = new RegistratedClient<Integer>(2522, "hjuj@gmail.com");
        Integer acc1Id = acc1.getId();
        LOGGER.info(acc1Id);

        DocumentsOfBuilders<String> doc = new DocumentsOfBuilders<String>("Every builder must have ");
        List<String> doc1 = doc.getBuildinfo();
        LOGGER.info(doc1);

        BuildersLunch<String > food = new BuildersLunch<String>("soup", "puree","tea");
        Integer f = acc1.getId();
        LOGGER.info(acc1Id);

        Wall silicate = new Wall(40, 1, "silicate Brick");
        Wall ceramic = new Wall(40, 1, "ceramic Brick");
        Stairs woodenStairs = new Stairs(68, 1, "Wooden stairs");
        Stairs contereStairs = new Stairs(68, 1, "Contere stairs");
        Roof metalTile = new Roof(685, 1, "metal Tile");
        Roof bitominousTile = new Roof(681, 1, "bitominous Tile");
        Overlap monolithic = new Overlap(950, 1,"monolithic overlap");
        Overlap woodenOverlap = new Overlap(900, 1, "wooden overlap");
        Foundation pileFoundation = new Foundation(203.5, 1,"Pile Foundation");
        Foundation tapeMonolithic = new Foundation(68, 1, "Tape Monolithic Foundation");
        FloorAndCeiling euroMaterials = new FloorAndCeiling(90, 1,"Laminate");
        FloorAndCeiling materials = new FloorAndCeiling(100, 1, "Tale");

        int finalPrice = 0;
        Scanner an = new Scanner(System.in);
        int answer = an.nextInt();
        Scanner num = new Scanner(System.in);
        int enternum = num.nextInt();
        boolean purchase = true;
        while(purchase){
            switch (enternum) {
                case 1:
                    LOGGER.info("Enter to add silicate brick");
                    finalPrice += silicate.getPrice();
                    break;
                case 2:
                    finalPrice += ceramic.getPrice();
                    break;
                case 3:
                    finalPrice += woodenStairs.getPrice();
                    break;
                case 4:
                    finalPrice += contereStairs.getPrice();
                    break;
                case 5:
                    finalPrice += metalTile.getPrice();
                    break;
                case 6:
                    finalPrice += bitominousTile.getPrice();
                    break;
                case 7:
                    finalPrice += monolithic.getPrice();
                    break;
                case 8:
                    finalPrice += woodenOverlap.getPrice();
                    break;
                case 9:
                    finalPrice += pileFoundation.getPrice();
                    break;
                case 10:
                    finalPrice += tapeMonolithic.getPrice();
                    break;
                case 11:
                    finalPrice += euroMaterials.getPrice();
                    break;
                case 12:
                    finalPrice += materials.getPrice();
                    break;
                case 0:
                    LOGGER.info("your price: " + finalPrice);
                    LOGGER.info("you wanna leave? yes - 1, no - 2");
                    if (answer == 1) {
                        purchase = false;
                    }else if(answer == 2){
                        return;
                    }else{
                        LOGGER.info("incorrect answer");
                    }
                default:
                    break;

            }
        }




    }
}