package com.ciberedu.Week01_Encapsulation.Mini_project;

public class Member {
    private String memberId;
    private String name;
    // TODO: Add the Book[] array field (size 3)
    private final Book[] borrowedBooks = new Book[3];

    public Member(String memberId, String name) {
        setMemberId(memberId);
        setName(name);
    }

    public String getMemberId() {
        return memberId;
    }

    private void setMemberId(String memberId) {
        if (memberId == null || memberId.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public boolean borrowBook(Book book) {
        if (!book.isAvailable()) {
            System.out.println(book.getTitle() + " is not available");
            return false;
        }
        // TODO: Loop through the array.
        for (int i = 0; i < borrowedBooks.length; i++) {
            // 1. Find the first slot that is null.
            if (borrowedBooks[i] == null) {
                // 2. Assign the book to that slot.
                borrowedBooks[i] = book;
                book.setAvailable(false);
                // 3. Return true (success).
                System.out.println(name + " has borrowed " + book.getTitle());
                return true;
            }
        }
        // If the loop finishes, and you found no space, return false.
        System.out.println("You have reached the maximum limit of books you can borrow.");
        return false;
    }
}
