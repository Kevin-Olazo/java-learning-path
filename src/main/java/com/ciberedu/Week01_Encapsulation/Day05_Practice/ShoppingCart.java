package com.ciberedu.Week01_Encapsulation.Day05_Practice;

public class ShoppingCart {
    private static double TAX_RATE = 0.08;

    final private String customerId;
    private double totalPrice;
    private int itemCount;

    public ShoppingCart(String customerId) {
        if (customerId == null || customerId.isEmpty()) {
            throw new IllegalArgumentException("Id cannot be empty.");
        }
        this.customerId = customerId;
        this.totalPrice = 0;
        this.itemCount = 0;
    }

    public void addItem(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Error. Price can't be negative");
        }
        this.totalPrice += price;
        this.itemCount++;
    }

    public void removeItem(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Error. Price can't be negative");
        }

        if (itemCount == 0) {
            throw new IllegalArgumentException("Error. Shopping cart is empty.");
        }

        if (itemCount == 1 && price < this.totalPrice) {
            throw new IllegalArgumentException("Error. Wrong product price, Cannot remove.");
        }

        this.totalPrice -= price;
        this.itemCount--;
    }

    public void clear() {
        this.totalPrice = 0;
        this.itemCount = 0;
    }

    public double getAveragePrice() {
        if (totalPrice == 0 || itemCount == 0) {
            throw new IllegalArgumentException("Error. Cannot divide by zero");
        }
        return totalPrice / itemCount;
    }

    public double getTotalWithTax() {
        return totalPrice + (totalPrice * TAX_RATE);
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    @Override
    public String toString() {
        return "CustomerId: " + customerId +
                " Number of Items: " + itemCount +
                " Subtotal: " + totalPrice +
                " TAX: " + totalPrice * TAX_RATE +
                " Total: " + getTotalWithTax();

    }
}


