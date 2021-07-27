package overlap;

import myinterface.IComponent;

import java.util.Objects;

public class TypeOfHouse implements IComponent {
    private int price;
    private String name;
    private String type;

    public TypeOfHouse(int price, String name, String type){
        this.price = price;
        this.name = name;
        this.type = type;
    }
    public TypeOfHouse() {
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeOfHouse that = (TypeOfHouse) o;
        return price == that.price && Objects.equals(name, that.name) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, type);
    }

    @Override
    public void thisComponent() {

    }
}
