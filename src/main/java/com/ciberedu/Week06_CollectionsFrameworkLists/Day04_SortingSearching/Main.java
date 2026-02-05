package com.ciberedu.Week06_CollectionsFrameworkLists.Day04_SortingSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> catalog = new ArrayList<>();

        Product p1 = new Product("Camisa", 89.90, 80);
        Product p2 = new Product("Pantalón", 59.90, 40);
        Product p3 = new Product("Short", 29.90, 30);
        Product p4 = new Product("Zapatilla", 49.90, 50);

        catalog.add(p1);
        catalog.add(p2);
        catalog.add(p3);
        catalog.add(p4);

        System.out.println("ORIGINAL LIST");

        for (Product p : catalog) {
            System.out.println(p.toString());
        }

        System.out.println("NATURAL ORDER LIST");

        Collections.sort(catalog);
        for (Product p : catalog) {
            System.out.println(p.toString());
        }

        System.out.println("NAME ORDER LIST");
        Comparator<Product> comparep1 = new ProductNameComparator();
        Collections.sort(catalog, comparep1);
        for (Product p : catalog) {
            System.out.println(p.toString());
        }

        System.out.println("STOCK ORDER LIST");
        Comparator<Product> comparep2 = new ProductStockComparator();
        Collections.sort(catalog, comparep2);
        for (Product p : catalog) {
            System.out.println(p.toString());
        }

        Collections.sort(catalog);

        Product searchProduct = new Product("Dummy", 49.90, 0);
        int indice = Collections.binarySearch(catalog, searchProduct);
        System.out.println(indice);

        System.out.println(catalog.get(indice));

        String nombre = "Zapatilla";

        for (Product p : catalog){
            if (p.getName().equals(nombre)){
                System.out.println("Producto " + nombre + " encontrado");
            }
        }

    }


}

