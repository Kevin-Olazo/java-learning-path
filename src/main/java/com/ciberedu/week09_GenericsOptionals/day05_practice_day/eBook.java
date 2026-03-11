package com.ciberedu.week09_GenericsOptionals.day05_practice_day;

abstract class eBook implements Comparable<eBook> {

    private String isbn;
    private String title;
    private Author author;
    private Genre genre;

    public eBook(String isbn, String title, Author author, Genre genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public int compareTo(eBook other) {
        return this.title.compareTo(other.title);
    }
}
