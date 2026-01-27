package com.ciberedu.Week05_Interfaces.Day04_CommonInterfaces;

import java.util.Comparator;

// TODO 2: Create a "Judge" to sort by Name (A-Z)
class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
