package com.ciberedu.Week04_AbstractClasses.Day05_Practice.NotificationSystem;

public class NotificationDemo {
    public static void main(String[] args) {

        Notification en = new EmailNotification();

        Notification smsn = new SMSNotification();

        en.executeNotification();

        smsn.executeNotification();
    }
}
