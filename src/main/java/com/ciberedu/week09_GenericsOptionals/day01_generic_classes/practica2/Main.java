package com.ciberedu.week09_GenericsOptionals.day01_generic_classes.practica2;

public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        System.out.println(p1.getKey() + " " + p1.getValue());

        Pair<String, String> p2 = new OrderedPair<String, String>("Hello", "World");
        System.out.println(p2.getKey() + " " + p2.getValue());

        OrderedPair<String, Integer> p3 = new OrderedPair<>("Even", 8);

        OrderedPair<String, String> p4 = new OrderedPair<>("hello", "world");
    }
}
