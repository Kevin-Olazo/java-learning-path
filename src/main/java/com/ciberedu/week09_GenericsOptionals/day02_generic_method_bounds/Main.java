package com.ciberedu.week09_GenericsOptionals.day02_generic_method_bounds;

public class Main {
    public static void main(String[] args) {
        Menu<Pizza> pizzaMenu = new Menu<>();
        Menu<Burger> burgerMenu = new Menu<>();
        Menu<Drink> drinkMenu = new Menu<>();

        // Menu<String> stringMenu = new Menu<>(); // This will cause a compile-time error because String does not extend MenuItem

        Pizza margherita = new Pizza("Margherita", 8.99);
        Pizza pepperoni = new Pizza("Pepperoni", 9.99);
        Pizza veggie = new Pizza("Veggie", 10.99);

        pizzaMenu.add(margherita);
        pizzaMenu.add(pepperoni);
        pizzaMenu.add(veggie);

        Burger cheeseburger = new Burger("Cheeseburger", 7.99);
        Burger veggieBurger = new Burger("Veggie Burger", 8.49);
        Burger chickenBurger = new Burger("Chicken Burger", 8.99);

        burgerMenu.add(cheeseburger);
        burgerMenu.add(veggieBurger);
        burgerMenu.add(chickenBurger);

        Drink cola = new Drink("Cola", 1.99);
        Drink lemonade = new Drink("Lemonade", 2.49);
        Drink water = new Drink("Water", 0.99);

        drinkMenu.add(cola);
        drinkMenu.add(lemonade);
        drinkMenu.add(water);

        System.out.println("-------------------");
        System.out.println("Drink Menu:");
        MenuUtilities.printMenu(drinkMenu.getItems());
        System.out.println("Total price of drinks: $" + MenuUtilities.calculateTotal(drinkMenu.getItems()));
        // System.out.println("Most expensive drink: " + MenuUtilities.findMax(drinkMenu.getItems())); // This will throw an exception because Drink does not implement Comparable

        System.out.println("-------------------");
        System.out.println("Burger Menu:");
        MenuUtilities.printMenu(burgerMenu.getItems());
        System.out.println("Total price of burgers: $" + MenuUtilities.calculateTotal(burgerMenu.getItems()));
        System.out.println("Most expensive burger: " + MenuUtilities.findMax(burgerMenu.getItems()));

        System.out.println("-------------------");
        System.out.println("Pizza Menu:");
        MenuUtilities.printMenu(pizzaMenu.getItems());
        System.out.println("Total price of pizzas: $" + MenuUtilities.calculateTotal(pizzaMenu.getItems()));
        System.out.println("Most expensive pizza: " + MenuUtilities.findMax(pizzaMenu.getItems()));

    }
}
