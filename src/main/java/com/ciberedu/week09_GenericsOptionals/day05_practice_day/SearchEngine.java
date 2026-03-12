package com.ciberedu.week09_GenericsOptionals.day05_practice_day;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SearchEngine {

    // TODO: Create a static generic method 'filterByGenre'
    // It should accept a List of generic books (Bounded by eBook) and a Genre.
    // It should return a filtered List of those books.
    // public static ...
    public static <T extends eBook> List<T> filterByGenre(List<T> list, Genre genre){
        List<T> filterList = new ArrayList<>();

        for (T item : list){
            if (genre.equals(item.getGenre())){
                filterList.add(item);
            }
        }

        return filterList;

    }


    // TODO: Advanced Optional Chaining
    // Given an Author, use flatMap to get their most recent book,
    // then use filter to only keep it if it's a TECHNICAL book.
    public static Optional<eBook> getRecentTechBookFromAuthor(Author author) {
        // Your code here
        return author.getMostRecentBook().filter((b) -> b.getGenre().equals(Genre.TECHNICAL));
    }
}
