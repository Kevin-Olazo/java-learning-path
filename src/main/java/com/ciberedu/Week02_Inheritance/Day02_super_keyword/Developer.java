package com.ciberedu.Week02_Inheritance.Day02_super_keyword;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double baseSalary, String programmingLanguage) {
        super(name, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeCode() {
        System.out.println("[" + getName() + "] is writing code in [" + programmingLanguage + "]");
    }

}
