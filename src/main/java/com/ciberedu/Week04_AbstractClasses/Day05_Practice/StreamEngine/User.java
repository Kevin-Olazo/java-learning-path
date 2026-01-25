package com.ciberedu.Week04_AbstractClasses.Day05_Practice.StreamEngine;

public class User {
    private String name;
    private boolean isSubscribed;
    private String region;

    public User(String name, boolean isSubscribed, String region) {
        this.name = name;
        this.isSubscribed = isSubscribed;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(boolean subscribed) {
        isSubscribed = subscribed;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
