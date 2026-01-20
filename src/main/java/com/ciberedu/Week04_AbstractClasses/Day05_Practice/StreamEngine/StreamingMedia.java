package com.ciberedu.Week04_AbstractClasses.Day05_Practice.StreamEngine;

public abstract class StreamingMedia {
    private String title;
    private int fileSize;

    public StreamingMedia(String title, int fileSize) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;

        if (fileSize < 0) {
            throw new IllegalArgumentException("File size cannot be negative");
        }
        this.fileSize = fileSize;
    }

    public StreamingMedia(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        this.title = title;
    }

    public StreamingMedia() {
    }

    // Template Method Pattern
    public void play(User user) {
        // 1. We check the user's subscription

        if (!checkSubscription(user)) {
            return;
        }
        // 2. We verify their region
        if (!verifyRegion(user)) {
            return;
        }
        ;

        // 3. We decode the media
        decodeMedia();
        // 4. We start the stream
        startStream();
    }

    private boolean checkSubscription(User user) {
        if (user == null) {
            System.out.println("User cannot be null");
            return false;
        }

        System.out.println("Checking subscription...");
        if (!user.isSubscribed()) {
            System.out.println("You need a subscription to watch this.");
            return false;
        } else {
            System.out.println("✅");
            return true;
        }

    }

    private void startStream() {
        System.out.println("Enjoy the show!");
    }


    public abstract boolean verifyRegion(User user);

    public abstract void decodeMedia();


}
