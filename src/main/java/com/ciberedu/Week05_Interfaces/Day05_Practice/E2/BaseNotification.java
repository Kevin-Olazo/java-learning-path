package com.ciberedu.Week05_Interfaces.Day05_Practice.E2;

import java.time.LocalDateTime;

public abstract class BaseNotification implements Notifiable {
    protected String recipient;

    protected LocalDateTime timestamp;

    public BaseNotification(String recipient) {
        this.recipient = recipient;
        this.timestamp = LocalDateTime.now();
    }

    public abstract String getType();
}
