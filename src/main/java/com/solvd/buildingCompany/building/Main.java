package com.solvd.buildingCompany.building;

import com.solvd.buildingCompany.enums.BuildersDocument;
import com.solvd.buildingCompany.enums.WeekendForBuilders;
import com.solvd.buildingCompany.generics.BuildersLunch;
import com.solvd.buildingCompany.generics.DocumentsOfBuilders;
import com.solvd.buildingCompany.generics.RegistratedClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        RegistratedClient<Integer> acc1 = new RegistratedClient<Integer>(2522, "hjuj@gmail.com");
        Integer acc1Id = acc1.getId();
        LOGGER.info(acc1Id);

        DocumentsOfBuilders<String> doc = new DocumentsOfBuilders<String>( "Every builder must have your package with documents");
        List<String> doc1 = doc.getBuildInfo();
        LOGGER.info(doc1);

        BuildersLunch<String > food = new BuildersLunch<String>("soup", "puree","tea");
        Integer f = acc1.getId();
        LOGGER.info(acc1Id);

        for (BuildersDocument document : BuildersDocument.values()) {
             LOGGER.info("Presentation of documents");
            LOGGER.info(document + ", " + document.getDoc());
        }

        Wall silicate = new Wall(40,  "silicate Brick");
        Wall ceramic = new Wall(40,  "ceramic Brick");
        Stairs woodenStairs = new Stairs(68,"Wooden stairs");
        Stairs contereStairs = new Stairs(68,"Contere stairs");
        Roof metalTile = new Roof(685,"metal Tile");
        Roof bitominousTile = new Roof(681,"bitominous Tile");
        Overlap monolithic = new Overlap(950,"monolithic overlap");
        Overlap woodenOverlap = new Overlap(900,"wooden overlap");
        Foundation pileFoundation = new Foundation(203.5,"Pile Foundation");
        Foundation tapeMonolithic = new Foundation(68,"Tape Monolithic Foundation");
        FloorAndCeiling euroMaterials = new FloorAndCeiling(90,"Laminate");
        FloorAndCeiling materials = new FloorAndCeiling(100, "Tale");
        double yourPrice  = yourPrice(5, euroMaterials.getPrice());
        double yourPricee  = yourPrice(8, materials.getPrice());

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
                    if (answer == 1)  {
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
    private static double yourPrice(int amount, double price) {
        return  amount * price;
    }
}