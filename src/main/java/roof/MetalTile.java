package roof;

import myinterface.ICompanyNumber;

public class MetalTile extends Roof implements ICompanyNumber {
    private int phoneNumber;

    public MetalTile (int price, String name, int phoneNumber){
        super(name, price);
        this.phoneNumber = phoneNumber;
    }
    public MetalTile () {
    }
    public int getTelephoneNumber() {
        return phoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.phoneNumber = telephoneNumber;
    }

    @Override
    public void haveCompanyNumber() {
        System.out.println("If you want to contact us, company number: 565845120");
    }
}
