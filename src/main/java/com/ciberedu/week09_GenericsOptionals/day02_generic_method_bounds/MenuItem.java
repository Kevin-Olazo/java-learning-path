package com.ciberedu.week09_GenericsOptionals.day02_generic_method_bounds;

public class MenuItem implements Comparable<MenuItem> {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(MenuItem o) {
        return Double.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price;
    }
}
