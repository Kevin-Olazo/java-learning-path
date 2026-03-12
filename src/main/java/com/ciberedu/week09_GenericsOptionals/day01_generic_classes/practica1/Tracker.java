package com.ciberedu.week09_GenericsOptionals.day01_generic_classes.practica1;

public class Tracker<K,V> {

    private K id;
    private V payload;

    public Tracker(K id, V payload){
        this.id = id;
        this.payload = payload;
    }

    public K getId() {
        return id;
    }

    public V getPayload() {
        return payload;
    }
}
