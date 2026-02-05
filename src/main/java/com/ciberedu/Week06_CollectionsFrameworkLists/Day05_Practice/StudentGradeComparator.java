package com.ciberedu.Week06_CollectionsFrameworkLists.Day05_Practice;

import java.util.Comparator;

public class StudentGradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getGrade(), o1.getGrade());
    }
}
