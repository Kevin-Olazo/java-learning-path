package com.ciberedu.Week01_Encapsulation.Mini_project;

public class Library {
    private Book[] bookCollection;
    private int bookCount;

    public Library() {
        this.bookCollection = new Book[100];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < 100) {
            bookCollection[bookCount] = book;
            bookCount++;
        } else {
            throw new IllegalArgumentException("There's no more room for books.");
        }
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (bookCollection[i].getISBN().equals(isbn)) {
                return bookCollection[i];
            }
        }
        System.out.println("Book not found");
        return null;
    }
}
