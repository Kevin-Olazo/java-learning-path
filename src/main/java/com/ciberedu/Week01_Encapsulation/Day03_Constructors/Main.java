package com.ciberedu.Week01_Encapsulation.Day03_Constructors;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "Daniel", 3000.0, "IT");

        Employee e2 = new Employee(1002, "John");

        e1.printDetails();
        e2.printDetails();
    }
}
