package com.ciberedu.Week06_CollectionsFrameworkLists.Day05_Practice;

import com.ciberedu.Week06_CollectionsFrameworkLists.Day04_SortingSearching.ProductNameComparator;


import java.util.*;

public class StudentRegistry {
    private List<Student> studentList;

    public StudentRegistry() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student s) {
        this.studentList.add(s);
    }

    // 1. Elimina estudiantes con grade < 60.
    // REGLA: Debes usar un Iterator explícito (como en el calentamiento).
    public void removeFailingStudents() {
        // Tu código aquí
        Iterator<Student> it = studentList.iterator();

        while (it.hasNext()){
            Student s = it.next();
            if (s.getGrade() < 60){
                it.remove();
            }
        }
    }

    // 2. Ordena la lista por nombre (A-Z)
    // PISTA: Usa Collections.sort() y tu StudentNameComparator
    public void sortByName() {
        // Tu código aquí
        StudentNameComparator snc = new StudentNameComparator();
        Collections.sort(studentList, snc);
    }

    // 3. Ordena la lista por nota (Mayor a menor)
    // PISTA: Usa Collections.sort() y tu GradeComparator
    public void sortByGrade() {
        // Tu código aquí
        StudentGradeComparator sgc = new StudentGradeComparator();
        Collections.sort(studentList, sgc);
    }
}
