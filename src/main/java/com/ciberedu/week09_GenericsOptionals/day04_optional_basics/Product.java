package com.ciberedu.week09_GenericsOptionals.day04_optional_basics;

public class Product {
    private String id;
    private String category;

    public Product(String id, String category) {
        this.id = id;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "id: " + id + ", category: " + category;
    }
}
