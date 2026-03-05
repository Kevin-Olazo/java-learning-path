package com.ciberedu.week09_GenericsOptionals.day02_generic_method_bounds;

import java.util.ArrayList;
import java.util.List;

public class Menu<T extends MenuItem> {
    private List<T> items = new ArrayList<>();

    public List<T> getItems() {
        return items;
    }

    public void add(T item){
        if (item != null){
            this.items.add(item);
        } else {
            throw new IllegalArgumentException("Item cannot be null");
        }

    }
}
