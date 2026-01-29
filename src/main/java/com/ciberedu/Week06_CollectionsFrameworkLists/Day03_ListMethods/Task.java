package com.ciberedu.Week06_CollectionsFrameworkLists.Day03_ListMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Task {
    String title;
    boolean isComplete;

    public Task(String title) {
        this.title = title;
        this.isComplete = false;
    }

    public void complete() { this.isComplete = true; } // Helper simple

    @Override
    public String toString() { return title + (isComplete ? " [X]" : " [ ]"); }
}