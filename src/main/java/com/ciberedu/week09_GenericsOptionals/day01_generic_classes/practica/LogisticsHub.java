package com.ciberedu.week09_GenericsOptionals.day01_generic_classes.practica;

public class LogisticsHub {


    public <T> Tracker<String, Crate<T>> processOrder(String trackingNumber, T item){

        if (trackingNumber == null || trackingNumber.isEmpty()){
            throw new IllegalArgumentException("Error: track number cannot be empty");
        }

        if (item == null){
            throw new IllegalArgumentException("Error: there's no item");
        }

        Crate<T> crate = new Crate<>();
        crate.insert(item);

        return new Tracker<>(trackingNumber, crate);

    }
}
