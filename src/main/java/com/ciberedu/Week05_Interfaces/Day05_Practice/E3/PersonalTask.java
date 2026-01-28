package com.ciberedu.Week05_Interfaces.Day05_Practice.E3;

public class PersonalTask extends BaseTask implements Completable, Prioritizable{
    public PersonalTask(String title) {
        super(title);
    }

    @Override
    public void complete() {
        System.out.println("Personal task completed");
    }

    @Override
    public void setPriority(String level) {
        System.out.println("Personal task, priority: " + level);
    }
}
