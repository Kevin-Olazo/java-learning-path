package com.ciberedu.Week05_Interfaces.Day05_Practice.E2;

public class EmailNotification extends BaseNotification {

    public EmailNotification(String recipient) {
        super(recipient);
    }

    @Override
    public String getType() {
        return "EMAIL";
    }

    @Override
    public void send(String message) {
        System.out.println("[" + getType() +"] Enviando a " + recipient + ": "   + message);
    }
}
