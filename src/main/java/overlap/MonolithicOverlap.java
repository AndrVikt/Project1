package overlap;

import java.util.Objects;

public class MonolithicOverlap extends Overlap {
    private int phoneNumberOfThisBuilder;
    private String nameBuilder;
    private int countBuilder;

    public MonolithicOverlap (int price, String name, String monolithicOverlap, String woodenOverlap, int phoneNumberOfThisBuilder,
                              String nameBuilder, int countBuilder){
        super(name, price, monolithicOverlap, woodenOverlap);
        this.phoneNumberOfThisBuilder = phoneNumberOfThisBuilder;
        this.nameBuilder = nameBuilder;
        this.countBuilder = countBuilder;
    }
    public MonolithicOverlap () {
    }
    public int getPhoneNumberOfThisBuilder() {
        return phoneNumberOfThisBuilder;
    }

    public void setPhoneNumberOfThisBuilder(int phoneNumberOfThisBuilder) { this.phoneNumberOfThisBuilder = phoneNumberOfThisBuilder; }

    public int getCountBuilder() {
        return countBuilder;
    }

    public void setCountBuilder(int countBuilder) { this.countBuilder = countBuilder; }

    public String getNameBuilder() {
        return nameBuilder;
    }

    public void setNameBuilder(String nameBuilder) { this.nameBuilder = nameBuilder; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MonolithicOverlap that = (MonolithicOverlap) o;
        return phoneNumberOfThisBuilder == that.phoneNumberOfThisBuilder && countBuilder == that.countBuilder && Objects.equals(nameBuilder, that.nameBuilder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), phoneNumberOfThisBuilder, nameBuilder, countBuilder);
    }
}
