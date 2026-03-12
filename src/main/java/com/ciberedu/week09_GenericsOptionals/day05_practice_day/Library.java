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
        for (T book : books){
            if (isbn.equals(book.getIsbn())){
                return Optional.of(book);
            }
        }

        return Optional.empty();
   }

   public List<T> findBooksByAuthor(Author author){
        List<T> booksFound = new ArrayList<>();

        for (T book : books){
            if (author.equals(book.getAuthor())){
                booksFound.add(book);
            }
        }

        return booksFound;
   }

   public String getAuthorNameByBookISBN(String isbn){
        return findBookByISBN(isbn).map((b) -> b.getAuthor().getName()).orElse("No encontrado");
   }
}
