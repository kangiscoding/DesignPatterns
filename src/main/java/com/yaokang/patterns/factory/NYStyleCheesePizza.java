package com.yaokang.patterns.factory;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NYStyleCheesePizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";

        toppings.add("Grated Reggiano Cheese.");
    }

}
