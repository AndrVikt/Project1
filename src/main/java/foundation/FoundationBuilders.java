package foundation;

import myinterface.IWholesale;

import java.util.Objects;

public class FoundationBuilders extends Foundation implements IWholesale {
    private int phoneNumber;

    public FoundationBuilders(String name, int phoneNumber){
        super(name);
        this.phoneNumber = phoneNumber;
    }

    public int getTelephoneNumber() {
        return phoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.phoneNumber = telephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FoundationBuilders that = (FoundationBuilders) o;
        return phoneNumber == that.phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), phoneNumber);
    }

    @Override
    public void haveWholesale() {
        System.out.println("10% discout on Saturday and Wednesday");
    }
}
