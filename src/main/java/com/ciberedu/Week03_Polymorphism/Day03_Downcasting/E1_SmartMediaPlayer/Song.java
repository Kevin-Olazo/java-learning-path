package com.ciberedu.Week03_Polymorphism.Day03_Downcasting.E1_SmartMediaPlayer;

public class Song extends MediaFile{
    private boolean isInstrumental;

    public Song(boolean isInstrumental) {
        this.isInstrumental = isInstrumental;
    }

    public boolean isInstrumental() {
        return isInstrumental;
    }

    public void listen() {
        System.out.println("Listening song...");
    }
}
