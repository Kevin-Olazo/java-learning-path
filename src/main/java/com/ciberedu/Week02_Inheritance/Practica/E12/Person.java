package com.ciberedu.Week02_Inheritance.Practica.E12;

public class Person {
    private Address address;

    public Person(Address address) {
        this.address = address;
    }

    public String getFullAddress() {
        return address.getStreet() + ", " + address.getCity();
    }
}
