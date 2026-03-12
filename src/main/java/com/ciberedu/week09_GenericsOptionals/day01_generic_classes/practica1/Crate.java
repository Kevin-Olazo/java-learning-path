package com.ciberedu.week09_GenericsOptionals.day01_generic_classes.practica1;

public class Crate<T> {
    private T item;

    public void insert(T item){
        this.item = item;
    }

    public T extract(){
        T objeto = this.item;
        this.item = null;
        return objeto;
    }
}
