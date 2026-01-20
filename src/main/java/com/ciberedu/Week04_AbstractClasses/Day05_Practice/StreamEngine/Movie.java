package com.ciberedu.Week04_AbstractClasses.Day05_Practice.StreamEngine;

public class Movie extends StreamingMedia{

    @Override
    public void verifyRegion() {
        System.out.println("Verifying DRM for this region...");
    }

    @Override
    public void decodeMedia() {
        System.out.println("Buffering 4K video data...");
    }
}
