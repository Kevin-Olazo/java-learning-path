package com.ciberedu.week09_GenericsOptionals.day02_generic_method_bounds;

public class Pizza extends MenuItem implements Comparable<Pizza>{
    public Pizza(String name, double price) {
        super(name, price);
    }

    @Override
    public int compareTo(Pizza o) {
        return Double.compare(this.getPrice(), o.getPrice());
    }
}
