package com.ciberedu.Week02_Inheritance.Practica.E11;

public class Report extends TextDocument{
    private String author, department;

    public Report(String title, String content, String author, String department) {
        super(title, content);
        this.author = author;
        this.department = department;
    }

    public void printHeader() {
        System.out.println(getTitle() + " by " + author);
    }
}
