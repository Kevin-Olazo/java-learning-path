package com.ciberedu.Week03_Polymorphism.Day03_Downcasting.E1_SmartMediaPlayer;

public class Video extends MediaFile{
    private boolean is4K;

    public Video(boolean is4K) {
        this.is4K = is4K;
    }

    public boolean is4K() {
        return is4K;
    }

    public void watch() {
        System.out.println("Watching video...");
    }
}
