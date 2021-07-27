package wall;

import myinterface.IBuilders;
import myinterface.ICompanyNumber;
import myinterface.IInformation;

public class SilicateBrick extends Wall implements ICompanyNumber, IInformation, IBuilders{
    private int storePhoneNumber;

    public SilicateBrick (int price, String name){
        super(name, price);
        this.storePhoneNumber = storePhoneNumber;
    }
    public SilicateBrick () {
    }
    public int getStorePhoneNumber() {
        return storePhoneNumber;
    }

    public void setStorePhoneNumber(int telephoneNumber) {
        this.storePhoneNumber = storePhoneNumber;
    }

    public void haveCompanyNumber() {
        System.out.println("If you want to contact us, company number: 6269413247");
    }

    @Override
    public void builder() {
        String BuilderWall;
        System.out.println("Строительство дома из силикат кирпича длиться 6 дней");
    }


    @Override
    public void haveInformation() {
        System.out.println("Its advantage in comparison with ceramic is its cheapness." +
                "Disadvantages: sand-lime brick is not very durable, not waterproof.");
    }
}
