package com.ciberedu.Week01_Encapsulation.Mini_project;

public class Book {
    private final String ISBN;
    private String title;
    private String author;
    private int totalPages;
    private boolean isAvailable;

    public Book(String ISBN, String title, String author, int totalPages) {
        if (ISBN == null || ISBN.isEmpty()) {
            throw new IllegalArgumentException("ISBN cannot be empty");
        }
        this.ISBN = ISBN;
        setTitle(title);
        setAuthor(author);
        setTotalPages(totalPages);
        this.isAvailable = true;
    }

    private void setTitle(String title) {
        if (title == null || title.isEmpty()){
            this.title = "Unknown title";
        } else {
            this.title = title;
        }
    }

    private void setAuthor(String author) {
        if (author == null || author.isEmpty()){
            this.author = "Unknown author";
        } else {
            this.author = author;
        }
    }

    private void setTotalPages(int totalPages) {
        if (totalPages <= 0){
            throw new IllegalArgumentException("Error. Invalid number of pages.");
        }
        this.totalPages = totalPages;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
