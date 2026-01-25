package com.ciberedu.Week05_Interfaces.Day04_CommonInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> classroom = new ArrayList<>();
        classroom.add(new Student(8, "Bob", 66.5));
        classroom.add(new Student(4, "Alice", 83.0));
        classroom.add(new Student(10, "Charlie", 92.5));
        classroom.add(new Student(2, "Edward", 77.5));
        classroom.add(new Student(1, "Daniel", 62.5));


        System.out.println("--- Original List ---");
        printList(classroom);

        // TODO 1: Sort by Natural Order (ID)
        // Hint: The list elements implement Comparable
        // Code here...
        Collections.sort(classroom);

        System.out.println("\n--- Sorted by ID (Natural) ---");
        printList(classroom);

        // TODO 2: Sort by Name (A-Z) using your Comparator
        // Hint: Pass the 'judge' as the second argument
        // Code here...
        Collections.sort(classroom, new StudentNameComparator());

        System.out.println("\n--- Sorted by Name (A-Z) ---");
        printList(classroom);

        // TODO 3: Sort by Grade (High-Low) using your Comparator
        // Code here...

        System.out.println("\n--- Sorted by Grade (High-Low) ---");
        Collections.sort(classroom, new StudentGradeComparator());
        printList(classroom);
    }

    // Helper to print nicely
    private static void printList(List<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}

