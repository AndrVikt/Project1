package door;

import myinterface.IColor;
import myinterface.IWholesale;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class BuildDoor extends Door implements IColor, IWholesale {
    private String materials;
    private double amount;

    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(BuildDoor.class));
    public BuildDoor (int price, String name, String materials, double amount){
        super(name, price);
        this.materials = materials;
        this.amount = amount;
    }
    public BuildDoor () {
    }
    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }

    public String toString(){
      return "BuildDoor{" + "materials: " + materials + "amount: " + amount +
              "} " + super.toString();
    }

    @Override
    public void haveColor() {
        LOGGER.info("Сolor for every taste");
    }

    @Override
    public void haveWholesale() {
        LOGGER.info("You can buy 3 doors for the price of two");
    }

    public void builder(){
    }
}
