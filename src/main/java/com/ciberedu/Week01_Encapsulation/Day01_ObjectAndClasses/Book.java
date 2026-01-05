package com.ciberedu.Week01_Encapsulation.Day01_ObjectAndClasses;

public class Book {
    String title;
    String author;
    int pageCount;
    boolean isRead = false;

    public Book(String title, String author, int pageCount){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    void markAsRead(){
        this.isRead = true;
    }

    void getPagesRemaining(int pagesReadSoFar) {
        System.out.println("There are " + (pageCount - pagesReadSoFar) + " left to read.");
    }

    void printDetails() {
        System.out.println("Book info" +
                "Book title: " + title +
                "Book Author: " + author +
                "Total pages: " + pageCount);
    }
}
