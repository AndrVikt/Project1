package overlap;

import java.util.Objects;

public abstract class Overlap {
    private int price;
    private String name;
    private String woodenOverlap;
    private String monolithicOverlap;

    //public abstract void OutputOverlap ();
    public Overlap(){
    }
    public Overlap (String name,int price,String woodenOverlap,String monolithicOverlap){
        this.name = name;
        this.price = price;
        this.woodenOverlap = woodenOverlap;
        this.monolithicOverlap = monolithicOverlap;
    }

    public Overlap(String name, int price) {
    }

    @Override
    public String toString() {
        return "Doors {" +
                "Name: " + name + '\'' + ", Price: " + price +
                ", Hight: " + woodenOverlap + '\'' + ", Width: " + monolithicOverlap +
                '}';
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

    public void setPrice(int price) {
        this.price = price;
    }

    public String getWoodenOverlap() {
        return woodenOverlap;
    }

    public void setWoodenOverlap(String woodenOverlap) {
        this.woodenOverlap = woodenOverlap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Overlap overlap = (Overlap) o;
        return price == overlap.price && Objects.equals(name, overlap.name) && Objects.equals(woodenOverlap, overlap.woodenOverlap) && Objects.equals(monolithicOverlap, overlap.monolithicOverlap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, woodenOverlap, monolithicOverlap);
    }
}

