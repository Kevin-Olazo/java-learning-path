package com.ciberedu.Week03_Polymorphism.Day05_Practice.E3;

public class SMS extends Notification{

    @Override
    public void sendMessage() {
        System.out.println("Enviando SMS...");
    }
}
