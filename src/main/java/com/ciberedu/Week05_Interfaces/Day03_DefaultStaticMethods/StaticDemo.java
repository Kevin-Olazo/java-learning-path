package com.ciberedu.Week05_Interfaces.Day03_DefaultStaticMethods;

public class StaticDemo {
    public static void main(String[] args) {

        ConsoleLogger cl = new ConsoleLogger();
        FileLogger fl = new FileLogger();

        String test = "not null";
        String test1 = null;

        System.out.println(Logger.checkNull(test));
        System.out.println(Logger.checkNull(test1));

        cl.log("Testing");
        fl.log("Another test");

        DataProcessor dp = new DataProcessor();
        dp.reset();
    }
}
