package com.ciberedu.Week04_AbstractClasses.Day01_AbstractClasses.E2_StreamSubService;

public class VideoSubscription extends Subscription {
    private int screenNumbers;

    public VideoSubscription(String subscriberName, double basePrice, String planType, int screenNumbers) {
        super(subscriberName, basePrice, planType);
        this.screenNumbers = screenNumbers;
    }


    @Override
    public double calculateMonthlyFee() {
        switch (getPlanType()) {
            case "Standard" -> {
                return getBasePrice() + 6;
            }
            case "Premium" -> {
                return getBasePrice() + (3.00 * getScreenNumbers());
            }

            default -> {
                return getBasePrice();
            }
        }

    }

    @Override
    public void accessContent(String title) {
        System.out.println("Streaming [title]" + " on " + getScreenNumbers() + " screen(s)."  );
    }

    public int getScreenNumbers() {
        return screenNumbers;
    }

    public void setScreenNumbers(int screenNumbers) {
        this.screenNumbers = screenNumbers;
    }
}
