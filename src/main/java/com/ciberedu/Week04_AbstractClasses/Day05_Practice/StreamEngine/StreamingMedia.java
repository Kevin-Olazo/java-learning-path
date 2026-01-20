package com.ciberedu.Week04_AbstractClasses.Day05_Practice.StreamEngine;

public abstract class StreamingMedia {


    // Template Method Pattern
    public void play() {
        // 1. We check the user's subscription
        checkSubscription();
        // 2. We verify their region
        verifyRegion();
        // 3. We decode the media
        decodeMedia();
        // 4. We start the stream
        startStream();
    }

    private void checkSubscription() {
        System.out.println("Checking subscription...");
    }

    private void startStream() {
        System.out.println("Enjoy the show!");
    }


    public abstract void verifyRegion();

    public abstract void decodeMedia();


}
