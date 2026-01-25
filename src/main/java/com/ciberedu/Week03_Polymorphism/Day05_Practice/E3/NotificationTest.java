package com.ciberedu.Week03_Polymorphism.Day05_Practice.E3;

import java.util.ArrayList;

public class NotificationTest {
    public static void main(String[] args) {

        ArrayList<Notification> notifications = new ArrayList<>();

        Notification n1 = new Email();
        Notification n2 = new PushNotification();
        Notification n3 = new SMS();

        notifications.add(n1);
        notifications.add(n2);
        notifications.add(n3);

        for (Notification n : notifications) {
            n.sendMessage();
        }

    }
}

