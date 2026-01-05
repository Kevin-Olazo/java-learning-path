package com.ciberedu.Week01_Encapsulation.Day01_ObjectAndClasses;

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean isRead = false;

    public Book(String title, String author, int pageCount){
        setTitle(title);
        setAuthor(author);
        setPageCount(pageCount);
    }

    public void markAsRead(){
        this.isRead = true;
    }

    public int getPagesRemaining(int pagesReadSoFar) {
        return pageCount - pagesReadSoFar;
    }

    public void printDetails() {
        System.out.println(
                "Book title: " + title +
                " Book Author: " + author +
                " Total pages: " + pageCount);
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public int getPageCount() {
        return pageCount;
    }

    private void setPageCount(int pageCount) {
        if (pageCount <= 0) {
            throw new IllegalArgumentException("Error. Enter a valid page count number");
        }
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Error. Enter a valid author name.");
        }
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Error. Enter a valid author name.");
        }
        this.title = title;
    }
}
