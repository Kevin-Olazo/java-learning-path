package com.ciberedu.Week04_AbstractClasses.Day05_Practice.StreamEngine;

public class Podcast extends StreamingMedia{
    @Override
    public void verifyRegion() {
        System.out.println("Checking blackout restriction for live event...");
    }

    @Override
    public void decodeMedia() {
        System.out.println("Connecting to live feed...");
    }
}
