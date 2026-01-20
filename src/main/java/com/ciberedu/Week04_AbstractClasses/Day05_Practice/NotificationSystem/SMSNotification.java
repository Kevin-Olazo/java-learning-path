package com.ciberedu.Week04_AbstractClasses.Day05_Practice.NotificationSystem;

public class SMSNotification extends Notification{
    @Override
    public void send() {
        System.out.println("Sending SMS...");
    }
}
