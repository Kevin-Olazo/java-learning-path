package com.ciberedu.Week04_AbstractClasses.Day05_Practice.NotificationSystem;

public abstract class Notification {


    public void executeNotification() {
        validate();
        send();
        log();

    }

    private void validate() {
        System.out.println("Validating...");
    }

    private void log() {
        System.out.println("Logging...");
    }

    public abstract void send();


}
