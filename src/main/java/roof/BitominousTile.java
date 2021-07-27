package roof;

public class BitominousTile extends Roof {
    private int phoneNumber;

    public BitominousTile (int price, String name, int phoneNumber){
        super(name, price);
        this.phoneNumber = phoneNumber;
    }
    public BitominousTile () {
    }
    public int getTelephoneNumber() {
        return phoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.phoneNumber = telephoneNumber;
    }

}
