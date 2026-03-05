package com.ciberedu.week09_GenericsOptionals.day02_generic_method_bounds;

public class Burger extends MenuItem implements Comparable<Burger>{
    public Burger(String name, double price) {
        super(name, price);
    }

    @Override
    public int compareTo(Burger o) {
        return Double.compare(this.getPrice(), o.getPrice());
    }
}
