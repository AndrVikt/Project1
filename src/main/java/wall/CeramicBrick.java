package wall;

public class CeramicBrick extends Wall {
    private int phoneNumber;

    public CeramicBrick (int price, String name, int phoneNumber){
        super(name, price);
        this.phoneNumber = phoneNumber;
    }
    public CeramicBrick () {
    }
    public int getTelephoneNumber() {
        return phoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.phoneNumber = telephoneNumber;
    }

}
