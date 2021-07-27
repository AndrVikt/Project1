package wall;

import java.util.Objects;

public abstract class Wall {
    private int price;
    private String name;


    public Wall(){
    }
    public Wall (String name,int price){
        this.name = name;
        this.price = price;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wall wall = (Wall) o;
        return price == wall.price && Objects.equals(name, wall.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }
}
