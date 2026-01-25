package com.ciberedu.Week05_Interfaces.Day04_CommonInterfaces;

import java.util.*;

// TODO 1: Implement the interface to make Student sortable by ID naturally
public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + "}";
    }

    // TODO 1 Logic: Sort by ID (Low to High)
    @Override
    public int compareTo(Student other) {
        if (this.id < other.getId()){
            return -1;
        } else if(this.id > other.getId()) {
            return 1;
        }
        return 0;
    }
}






