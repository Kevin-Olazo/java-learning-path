package com.ciberedu.Week05_Interfaces.Day05_Practice.E3;

public class TaskSystem {
    public static void main(String[] args) {

        PersonalTask pt = new PersonalTask("Buy groceries");
        WorkTask wt = new WorkTask("Finish assignment");

        pt.setPriority("High");
        wt.assignTo("Daniel");
        wt.complete();

    }
}
