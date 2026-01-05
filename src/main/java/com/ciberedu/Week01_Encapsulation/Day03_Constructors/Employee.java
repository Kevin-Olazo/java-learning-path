package com.ciberedu.Week01_Encapsulation.Day03_Constructors;

public class Employee {
    // 1. Define Private Fields:
    // employeeId (int), name (String), salary (double), department (String)
    private int employeeId;
    private String name;
    private double salary;
    private String department;

    // 2. Constructor 1: The "Full" Option
    // Takes ALL parameters.
    // TODO: Add logic to validate that salary is > 0.
    public Employee(int employeeId, String name, double salary, String department) {
        // Assign values to fields here
        setEmployeeId(employeeId);
        setName(name);
        setSalary(salary);
        setDepartment(department);
    }

    // 3. Constructor 2: The "Quick Start" Option
    // Takes ONLY id and name.
    // TODO: Manually set salary to 3000.0 and department to "Unassigned" inside here.
    public Employee(int employeeId, String name) {
        // Assign values to fields here
        this(employeeId, name, 3000.0, "Unassigned");
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    private void setEmployeeId(int employeeId) {
        if (employeeId < 0) {
            throw new IllegalArgumentException("Error. Invalid id value.");
        }
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Error. Invalid name value");
        }
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Error. Invalid salary value.");
        }
        this.salary = salary;
    }

    public void setDepartment(String department) {
        if (department == null || department.isEmpty()) {
            throw new IllegalArgumentException("Error. Invalid name value");
        }
        this.department = department;
    }

    // 4. Create a printDetails() method so we can test it
    public void printDetails() {
        System.out.println("ID: " + employeeId + " | Name: " + name + " | Salary: " + salary + " | Dept: " + department);
    }
}