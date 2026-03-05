package com.ciberedu.week09_GenericsOptionals.day02_generic_method_bounds;

public class Main {
    public static void main(String[] args) {
        Menu<Pizza> pizzaMenu = new Menu<>();

        // Menu<String> stringMenu = new Menu<>(); // This will cause a compile-time error because String does not extend MenuItem

        Pizza margherita = new Pizza("Margherita", 8.99);
        Pizza pepperoni = new Pizza("Pepperoni", 9.99);
        Pizza veggie = new Pizza("Veggie", 10.99);

        pizzaMenu.add(margherita);
        pizzaMenu.add(pepperoni);
        pizzaMenu.add(veggie);



        MenuUtilities.printMenu(pizzaMenu.getItems());
        System.out.println(MenuUtilities.calculateTotal(pizzaMenu.getItems()));
        System.out.println(MenuUtilities.findMax(pizzaMenu.getItems()));



    }
}
