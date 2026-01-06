package com.ciberedu.Week02_Inheritance.Day01_extend_keyword;

public class TestVehicle {
    public static void main(String[] args) {

        Car car1 = new Car("Tesla", "Model 3", 2022, 4);
        Car car2 = new Car("Toyota", "Corolla", 2020, 4);
        Car car3 = new Car("Ford", "Mustang", 2019, 2);
        Car car4 = new Car("BMW", "X5", 2021, 5);

        Motorcycle mt1 = new Motorcycle("Yamaha", "MT-07", 2021, false);
        Motorcycle mt2 = new Motorcycle("Honda", "CBR500R", 2020, false);

        car1.start();
        car1.stop();
        mt1.start();
        mt1.stop();

        car1.openTrunk();
        mt1.doWheelie();

        car1.displayInfo();
        mt1.displayInfo();

    }
}
