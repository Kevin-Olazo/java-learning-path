package com.ciberedu.Week02_Inheritance.Day02_super_keyword;

public class TestEmployee {
    public static void main(String[] args) {
        Manager manag1 = new Manager("Kevin", 5000, 1000);

        Developer dev1 = new Developer("Alice", 6000, "Java");

        System.out.println(manag1.calculatePay());
        dev1.writeCode();
    }
}
