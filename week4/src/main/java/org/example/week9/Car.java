package org.example.week9;

public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Constructor full field.
     *
     * @param brand              string
     * @param model              string
     * @param registrationNumber string
     * @param owner              person
     * @param numberOfDoors      int
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Override method getInfo from Vehicle.
     * @return string
     */
    @Override
    public String getInfo() {
        return "Car:"
                + "\n\tBrand: " + getBrand()
                + "\n\tModel: " + getModel()
                + "\n\tRegistration Number: " + getRegistrationNumber()
                + "\n\tNumber of Doors: " + getNumberOfDoors()
                + "\n\tBelongs to " + getOwner();
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
