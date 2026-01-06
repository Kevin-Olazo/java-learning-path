package com.ciberedu.Week01_Encapsulation.Mini_project;

public class TestLibrary {

    public static void main(String[] args) {
        Library lb = new Library();

        Book b1 = new Book("CF101", "Harry Potter", "J.K. Rowling", 450);
        Book b2 = new Book("AB302", "Lord of the Rings", "J.R.R. Tolkien", 524);
        Book b3 = new Book("RT432", "El Principito", "Antoine de Saint-Exupéry", 55);
        Book b4 = new Book("GH855", "El Caballero Carmelo", "Abraham Valdelomar", 225);

        lb.addBook(b1);
        lb.addBook(b2);
        lb.addBook(b3);
        lb.addBook(b4);

        System.out.println(b1.isAvailable());


        Member bob = new Member("B-123", "Bob");

        bob.borrowBook(b1);
        System.out.println(b1.isAvailable());
        bob.borrowBook(b1);



    }
}

