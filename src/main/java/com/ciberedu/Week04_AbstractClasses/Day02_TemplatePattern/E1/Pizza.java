package com.ciberedu.Week04_AbstractClasses.Day02_TemplatePattern.E1;

public abstract class Pizza {

    // TEMPLATE METHOD
    final public void makePizza(){
        prepareDough();
        addSauce();
        addToppings();
        bake();
    }

    // CONCRETE METHODS
    public void prepareDough() {
        System.out.println("Preparing dough...");
    }

    public void bake() {
        System.out.println("Baking at 400°F for 20mins");
    }

    // ABSTRACT METHODS

    public abstract void addSauce();
    public abstract void addToppings();

}
