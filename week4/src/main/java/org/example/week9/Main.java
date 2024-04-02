package org.example.week9;

public class Main {
    public static void main(String[] args) {
        Person vanquyen = new Person("Nguyen Van A ","144 Xuan Thuy, Cau Giay, HN");
        Person trungkien = new Person("Phan Trung Kien ","Vu Chinh, Thai Binh");
        Vehicle car = new Car("Mercedes-Benz","S400","30A - 888.88", vanquyen, 4);
        Vehicle motorBike = new MotorBike("Yamaha", "YZF-R6","29 - P1 686.68", vanquyen, false);

        System.out.println(vanquyen.getVehiclesInfo());
        System.out.println(trungkien.getVehiclesInfo());

        car.transferOwnership(trungkien);

        System.out.println(vanquyen.getVehiclesInfo());
        System.out.println(trungkien.getVehiclesInfo());

        motorBike.transferOwnership(trungkien);
        car.transferOwnership(vanquyen);

        System.out.println(vanquyen.getVehiclesInfo());
        System.out.println(trungkien.getVehiclesInfo());
    }
}
