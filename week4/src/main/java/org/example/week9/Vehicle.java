package org.example.week9;

public abstract class Vehicle {
    protected String  brand;
    protected String  model;
    protected String  registrationNumber;
    protected Person owner;

    /**
     * Constructor full field.
     * @param brand                 string
     * @param model                 string
     * @param registrationNumber    string
     * @param owner                 person
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    //getter, setter

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    /**
     * abstract info vehicle.
     * @return string
     */
    public abstract String getInfo();

    /**
     * Transfer owner vehicle.
     * @param newOrder person
     */
    public void transferOwnership(Person newOrder) {
        owner.removeVehicle(registrationNumber);
        owner = newOrder;
        owner.addVehicle(this);
    }
}
