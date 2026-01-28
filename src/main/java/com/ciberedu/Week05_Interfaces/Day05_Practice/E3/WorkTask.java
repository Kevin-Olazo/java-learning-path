package com.ciberedu.Week05_Interfaces.Day05_Practice.E3;

public class WorkTask extends BaseTask implements Completable, Assignable, Prioritizable {

    public WorkTask(String title) {
        super(title);
    }

    @Override
    public void assignTo(String name) {
        System.out.println("Task assigned to " + name);
    }

    @Override
    public void complete() {
        System.out.println("Work task completed");
    }

    @Override
    public void setPriority(String level) {
        System.out.println("Work task, priority: " + level);
    }
}
