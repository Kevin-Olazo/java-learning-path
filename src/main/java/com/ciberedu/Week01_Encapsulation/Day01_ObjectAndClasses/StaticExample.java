package com.ciberedu.Week01_Encapsulation.Day01_ObjectAndClasses;

public class StaticExample {
    static int counter = 0;

    public StaticExample(){
        counter++;
    }

    static void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {

        StaticExample se1 = new StaticExample();
        StaticExample se2 = new StaticExample();
        StaticExample se3 = new StaticExample();

        System.out.println(se1.getCounter());
        System.out.println(se2.getCounter());
        System.out.println(se3.getCounter());

        StaticExample.incrementCounter();
        System.out.println("Counter: " + StaticExample.counter );

        System.out.println(se1.getCounter());
        System.out.println(se2.getCounter());
        System.out.println(se3.getCounter());
    }
}
