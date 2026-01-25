package com.ciberedu.Week05_Interfaces.Day04_CommonInterfaces;

import java.util.Comparator;

// TODO 3: Create a "Judge" to sort by Grade (High to Low)
class StudentGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getGrade() > s2.getGrade()){
            return -1;
        } else if (s1.getGrade() < s2.getGrade()) {
            return 1;
        }

        return 0;
    }
}
