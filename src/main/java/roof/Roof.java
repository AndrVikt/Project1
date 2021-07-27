package roof;

public abstract class Roof {
    private int price;
    private String name;

    //public abstract void OutputRoof ();
    public Roof(){
    }
    public Roof (String name,int price){
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
}
