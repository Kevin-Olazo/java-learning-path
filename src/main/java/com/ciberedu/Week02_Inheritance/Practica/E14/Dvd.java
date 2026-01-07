package com.ciberedu.Week02_Inheritance.Practica.E14;

public class Dvd extends LibraryItem{
    private int durationMinutes;

    public Dvd(String code, String title, boolean isAvailable, int durationMinutes) {
        super(code, title, isAvailable);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Duration: " + durationMinutes + " minutes.");
    }
}
