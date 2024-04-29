//package org.example.week12.bai2;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    public Person() {

    }

    /**
     * constructor.
     * @param name name
     * @param age age
     * @param address address
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person o) {
        int comparePerson = this.name.compareTo(o.name);
        if (comparePerson != 0) {
            return comparePerson;
        } else {
            return Integer.compare(this.age, o.age);
        }
    }

    /**
     * to string.
     */
    public String toString() {
        return "(name =" + name + ", age=" + age
                + ", address=" + address + ")\n";
    }

}
