package com.ciberedu.week09_GenericsOptionals.day01_generic_classes;

import java.util.ArrayList;

public class Container<T> {
    private T item;

    public void add(T item){
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void clear(){
        this.item = null;
    }

    public boolean isEmpty(){
        return item == null;
    }
}
