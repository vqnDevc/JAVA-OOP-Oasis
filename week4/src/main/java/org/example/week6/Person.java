//package org.example.week6;

public class Person {
    private String name;
    private String address;

    /**
     * Constructor.
     * @param name : String
     * @param address : String
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
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
     * Override toString method default if Object.
     * @return : format String
     */
    @Override
    public String toString() {
        return "Person[" + "name=" + name + ",address=" + address + ']';
    }
}
