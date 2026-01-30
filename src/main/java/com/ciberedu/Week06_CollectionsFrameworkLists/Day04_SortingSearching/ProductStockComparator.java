package com.ciberedu.Week06_CollectionsFrameworkLists.Day04_SortingSearching;

import java.util.Comparator;

public class ProductStockComparator implements Comparator<Product> {

    public int compare(Product p1, Product p2) {
        return Integer.compare(p1.getStock(), p2.getStock());
    }
}
