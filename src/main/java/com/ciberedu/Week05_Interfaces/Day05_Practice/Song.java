package com.ciberedu.Week05_Interfaces.Day05_Practice;

public class Song {
    private String title;

    private int duration;

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song title: " + title + " | Duration: " + duration + " seconds.";
    }
}
