package com.ciberedu.Week02_Inheritance.Day02_super_keyword;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        if (name == null || name.isEmpty() || name.trim().length() <= 1) {
            throw new IllegalArgumentException("Error. Invalid name value");
        }
        this.name = name;

        if (baseSalary < 0) {
            throw new IllegalArgumentException("Error. Enter a valid value");
        }
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }

    public void displayInfo() {
        System.out.println("Name: [" + name + "] | Salary: [" + baseSalary + "]");
    }
}
