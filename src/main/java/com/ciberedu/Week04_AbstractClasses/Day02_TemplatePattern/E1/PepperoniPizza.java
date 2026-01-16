package com.ciberedu.Week04_AbstractClasses.Day02_TemplatePattern.E1;

public class PepperoniPizza extends Pizza{

    @Override
    public void addSauce() {
        System.out.println("Adding Tomato Sauce...");
    }

    @Override
    public void addToppings() {
        System.out.println("Adding Pepperoni...");
    }
}
