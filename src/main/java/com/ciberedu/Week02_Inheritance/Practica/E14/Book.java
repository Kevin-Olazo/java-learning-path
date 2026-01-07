package com.ciberedu.Week02_Inheritance.Practica.E14;

public class Book extends LibraryItem{
    private int pages;

    public Book(String code, String title, boolean isAvailable, int pages) {
        super(code, title, isAvailable);
        this.pages = pages;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Pages: " + pages);
    }
}
