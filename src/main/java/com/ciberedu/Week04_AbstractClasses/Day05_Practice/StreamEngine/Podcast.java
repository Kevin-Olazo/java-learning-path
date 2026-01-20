package com.ciberedu.Week04_AbstractClasses.Day05_Practice.StreamEngine;

public class Podcast extends StreamingMedia{
    @Override
    public boolean verifyRegion(User user) {
        System.out.println("Checking blackout restriction for live event...");
        return false;
    }

    @Override
    public void decodeMedia() {
        System.out.println("Connecting to live feed...");
    }
}
