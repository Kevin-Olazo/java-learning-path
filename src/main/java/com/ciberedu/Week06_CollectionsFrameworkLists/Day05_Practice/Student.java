package com.ciberedu.Week06_CollectionsFrameworkLists.Day05_Practice;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private int grade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}



