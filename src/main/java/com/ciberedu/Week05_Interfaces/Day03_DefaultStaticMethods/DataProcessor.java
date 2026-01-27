package com.ciberedu.Week05_Interfaces.Day03_DefaultStaticMethods;

public class DataProcessor implements Sortable, Filterable {

    @Override
    public void reset() {
        Sortable.super.reset();
    }
}
