package com.ciberedu.Week05_Interfaces.Day05_Practice.E2;

public class SMSNotification extends BaseNotification {

    public SMSNotification(String recipient) {
        super(recipient);
    }

    @Override
    public String getType() {
        return "SMS";
    }

    @Override
    public void send(String message) {
        System.out.println("[" + getType() +"] Enviando a " + recipient + ": "   + message);
    }
}
