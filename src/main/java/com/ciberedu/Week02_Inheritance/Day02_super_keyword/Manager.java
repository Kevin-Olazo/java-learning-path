package com.ciberedu.Week02_Inheritance.Day02_super_keyword;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        if (bonus <= 0) {
            throw new IllegalArgumentException("Error. Enter a valid bonus value.");
        }
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + bonus;
    }
}
