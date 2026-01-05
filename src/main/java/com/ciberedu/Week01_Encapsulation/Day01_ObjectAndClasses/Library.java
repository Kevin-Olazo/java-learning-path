package com.ciberedu.Week01_Encapsulation.Day01_ObjectAndClasses;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("Harry potter", "J.K. Rowling", 550);

        Book book2 = new Book("Lord of the Rings", "J.R.R. Tolkien", 620);

        Book book3 = new Book("Game of Thrones", "George R.R. Martin", 729);

        book1.printDetails();
        book2.printDetails();
        book3.printDetails();

        book2.markAsRead();

        System.out.println(book3.getPagesRemaining(100));

        Book book4 = new Book("", "", -400);

        book4.printDetails();


    }
}
