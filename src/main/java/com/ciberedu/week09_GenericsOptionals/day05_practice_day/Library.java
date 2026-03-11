package com.ciberedu.week09_GenericsOptionals.day05_practice_day;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library<T extends eBook> {
    private List<T> books = new ArrayList<>();

    public void addBook(T book){
        books.add(book);
    }

    public List<T> getAllBooks() {
        return List.copyOf(books);
    }

   public Optional<T> findBookByISBN(String isbn){


        return Optional.empty();
   }

   public List<T> findBooksByAuthor(Author author){

        return new ArrayList<>();
   }

   public String getAuthorNameByBookISBN(String isbn){

        return "Unknown Author";
   }
}
