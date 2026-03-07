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
    // Wildcard method to print any list of items
    // This method can accept a list of any type, but we won't be able to call any specific methods on the items
    // We can only call methods that are available on Object, such as toString()
    // This is useful for printing a list of items without needing to know their specific type
    // Note: We cannot use T here because T is not defined in this method, we need to use a wildcard

    public static void printMenu(List<?> items){
        for (Object item : items){
            System.out.println(item.toString());
        }
    }
}
