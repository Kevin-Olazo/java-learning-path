package com.ciberedu.Week04_AbstractClasses.Day05_Practice.StreamEngine;

public class LiveSport extends StreamingMedia{

    public LiveSport(String title) {
        super(title);
    }

    @Override
    public boolean verifyRegion(User user) {
        System.out.println("Checking blackout restriction for live event...");
        if (!user.getRegion().equals("US")){
            System.out.println("You cannot watch this event.");
            return false;
        } else {
            System.out.println("✅");
            return true;
        }
    }

    @Override
    public void decodeMedia() {
        System.out.println("Connecting to live feed...");
    }
}
