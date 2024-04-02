package org.example.week9;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private final List<Vehicle> vehicleList;

    /**
     * Person constructor.
     * @param name string
     * @param address string
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        vehicleList = new ArrayList<>();
    }

    /**
     * add new vehicle to personal vehicle list.
     * @param vehicle Vehicle class
     */
    public void addVehicle (Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * remove a vehicle from personal vehicle list by registrationNumber.
     * @param registrationNumber : string
     */
    public void removeVehicle(String registrationNumber) {
        vehicleList.removeIf(vehicle -> vehicle.getRegistrationNumber().equals(registrationNumber));
    }

    /**
     * Get info vehicles.
     * @return string
     */
    public String getVehiclesInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        if (vehicleList.isEmpty()) {
            stringBuilder.append(name).append(" has no vehicle!");
        } else {
            stringBuilder.append(name).append(" has:\n\n");

            for (Vehicle vehicle : vehicleList) {
                stringBuilder.append(vehicle.getInfo()).append("\n");
            }
        }
        return  stringBuilder.toString();
    }

    //getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Override method ToString of class.
     * @return string
     */
    @Override
    public String toString() {
        return getName() + " - " + getAddress();
    }
}
