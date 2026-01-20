package com.ciberedu.Week04_AbstractClasses.Day05_Practice.NotificationSystem;

public class EmailNotification extends Notification{

    @Override
    public void send() {
        System.out.println("Sending Email...");
    }
}
