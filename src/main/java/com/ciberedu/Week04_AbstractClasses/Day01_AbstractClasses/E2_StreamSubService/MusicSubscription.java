package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E2_StreamSubService;

public class MusicSubscription extends Subscription {
    private boolean familyPlan;

    public MusicSubscription(String subscriberName, double basePrice, String planType, boolean familyPlan) {
        super(subscriberName, basePrice, planType);
        this.familyPlan = familyPlan;
    }

    @Override
    public double calculateMonthlyFee() {
        if (familyPlan) {
            return getBasePrice() + 10;
        } else {
            return getBasePrice();
        }
    }

    @Override
    public void accessContent(String title) {
        System.out.println("Playing song: " + title + " (Family Shared: " + isFamilyPlan() + ")");
    }

    public boolean isFamilyPlan() {
        return familyPlan;
    }
}
