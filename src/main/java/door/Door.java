package door;

import java.util.Objects;

public abstract class Door {
    private double price;
    private String name;
    private double hight;
    private double width;



    public Door(){
    }
    public Door (String name,double price){
        this.name = name;
        this.price = price;
        this.hight = hight;
        this.width = width;

        try {
            if (hight == width) {
                throw new ExceptionForDoor("The door for your home cannot be square");
            }
        }
        catch (ExceptionForDoor e) {
            e.printStackTrace();
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() { return price; }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWidth() { return width; }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() { return hight; }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Doors {" +
                "Name: " + name + '\'' + ", Price: " + price +
                ", Hight: " + hight + '\'' + ", Width: " + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return Double.compare(door.price, price) == 0 && Double.compare(door.hight, hight) == 0 && Double.compare(door.width, width) == 0 && Objects.equals(name, door.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, hight, width);
    }
}
