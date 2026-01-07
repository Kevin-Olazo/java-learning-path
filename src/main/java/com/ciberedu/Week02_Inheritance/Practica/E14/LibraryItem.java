package com.ciberedu.Week02_Inheritance.Practica.E14;

public class LibraryItem {
    private String code, title;
    private boolean isAvailable;

    public LibraryItem(String code, String title, boolean isAvailable) {
        this.code = code;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public void borrow() {
        if (isAvailable) {
            this.isAvailable = false;
            System.out.println("Borrowing " + title);
        } else {
            System.out.println("Item is not available");
        }
    }

    public void returnItem() {
        if (!isAvailable){
            this.isAvailable = true;
            System.out.println("Returning " + title);
        } else {
            System.out.println("Item already available");
        }
    }

    public void details() {
        String available = isAvailable ? "Yes" : "No";
        System.out.println("Code: " + code + " Title: " + title + " Available: " + available);
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
