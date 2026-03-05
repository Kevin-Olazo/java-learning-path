package com.ciberedu.week09_GenericsOptionals.day02_generic_method_bounds;

import java.util.List;

public class MenuUtilities {

    public static <T extends MenuItem> double calculateTotal(List<T> items){
        double total = 0.0;
        for(T item : items){
            total += item.getPrice();
        }
        return total;
    }

    public static <T extends MenuItem & Comparable<T>> T findMax(List<T> items){
        if (items == null || items.isEmpty()){
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        T max = items.get(0);
        for (T item : items) {
            if(item.compareTo(max) > 0){
                max = item;
            }
        }

        return max;
    }

    public static void printMenu(List<?> items){
        for (Object item : items){
            System.out.println(item.toString());
        }
    }
}
