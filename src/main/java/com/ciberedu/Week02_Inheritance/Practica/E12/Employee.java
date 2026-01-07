package com.ciberedu.Week02_Inheritance.Practica.E12;

public class Employee extends Person {
    private String employeeId;

    public Employee(Address address, String employeeId) {
        super(address);
        this.employeeId = employeeId;
    }

    public void fullInfo() {
        System.out.println("Employee ID: " + employeeId + " Address: " + getFullAddress());

    }
}
