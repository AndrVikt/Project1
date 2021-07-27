package foundation;

import door.BuildDoor;

import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public abstract class Foundation {
    private int price;
    private String name;
    private String pileFoundation;
    private String tapeMonolithic;
    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Foundation.class));

    public Foundation(String name){
    }
    public Foundation (String name,int price, String pileFoundation, String tapeMonolithic){
        this.name = name;
        this.price = price;
        this.pileFoundation = pileFoundation;
        this.tapeMonolithic = tapeMonolithic;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) { this.price = price; }

    public String getPileFoundation() {
        return pileFoundation;
    }

    public void setPileFoundation(String pileFoundation) {
        this.pileFoundation = pileFoundation;
    }

    public String getTapeMonolithic() {
        return tapeMonolithic;
    }

    public void setTapeMonolithic(String tapeMonolithic) {
        this.tapeMonolithic = tapeMonolithic;
    }

    @Override
    public String toString() {
        return "Doors {" +
                "Name: " + name + '\'' + ", Price: " + price +
                ", Hight: " + pileFoundation + '\'' + ", Width: " + tapeMonolithic +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foundation that = (Foundation) o;
        return price == that.price && Objects.equals(name, that.name) && Objects.equals(pileFoundation, that.pileFoundation) && Objects.equals(tapeMonolithic, that.tapeMonolithic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, pileFoundation, tapeMonolithic);
    }

    public void builder()  {
        LOGGER.info("You can have 5 builders for this work");
    }
}
