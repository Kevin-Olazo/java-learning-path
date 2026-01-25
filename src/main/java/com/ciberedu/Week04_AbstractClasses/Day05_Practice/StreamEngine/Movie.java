package com.ciberedu.Week04_AbstractClasses.Day05_Practice.StreamEngine;

public class Movie extends StreamingMedia{

    public Movie(String title, int fileSize) {
        super(title, fileSize);
    }

    @Override
    public boolean verifyRegion(User user) {
        System.out.println("Verifying DRM for this region...");
        if (!user.getRegion().equals("US")){
            System.out.println("This movie is unavailable for your region");
            return false;
        } else {
            System.out.println("✅");
            return true;
        }
    }

    @Override
    public void decodeMedia() {
        System.out.println("Buffering 4K video data...");
    }
}
