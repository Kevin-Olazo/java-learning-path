package com.ciberedu.week09_GenericsOptionals.day05_practice_day;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Author {
    private String name;
    private List<eBook> writtenBooks = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<eBook> getWrittenBooks() {
        return List.copyOf(writtenBooks);
    }

    public void addBook(eBook book){
        if (book != null){
            writtenBooks.add(book);
        }
    }

    public Optional<eBook> getMostRecentBook(){
        if (writtenBooks.isEmpty()) return Optional.empty();

        return Optional.of(writtenBooks.get(writtenBooks.size() - 1));
    }
}
