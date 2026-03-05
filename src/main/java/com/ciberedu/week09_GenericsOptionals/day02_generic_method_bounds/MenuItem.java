package com.ciberedu.week09_GenericsOptionals.day02_generic_method_bounds;

public class MenuItem implements Comparable<MenuItem> {
    private String name;
    private double price;

    @Override
    public int compareTo(MenuItem o) {
        return 0;
    }
}
