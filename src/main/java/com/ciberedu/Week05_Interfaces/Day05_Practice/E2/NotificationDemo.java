package com.ciberedu.Week05_Interfaces.Day05_Practice.E2;

import java.util.ArrayList;
import java.util.List;

public class NotificationDemo {
    public static void main(String[] args) {
        List<BaseNotification> notifications = new ArrayList<>();

        notifications.add(new EmailNotification("cliente@empresa.com"));
        notifications.add(new SMSNotification("+51 999 999 999"));

        for (BaseNotification bn : notifications) {
            bn.send("Hola, tu pedido esta listo");
        }
    }
}
