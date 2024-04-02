package org.example.week9;

public class MotorBike extends Vehicle{
    private boolean hasSidecar;

    /**
     * Constructor full field.
     *
     * @param brand              string
     * @param model              string
     * @param registrationNumber string
     * @param owner              person
     * @param hasSidecar         boolean
     */
    public MotorBike(String brand, String model, String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
        owner.addVehicle(this);
    }

    /**
     * Override method getInfo from Vehicle.
     * @return string
     */
    @Override
    public String getInfo() {
        return "Motor Bike:" +
                "\n\tBrand: " + getBrand() +
                "\n\tModel: " + getModel() +
                "\n\tRegistration Number: " + getRegistrationNumber() +
                "\n\tHas Side Car: " + isHasSidecar() +
                "\n\tBelongs to " + getOwner();
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
