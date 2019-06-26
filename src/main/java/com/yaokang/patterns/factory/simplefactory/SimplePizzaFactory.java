package com.yaokang.patterns.factory.simplefactory;

import com.yaokang.patterns.factory.ChicagoStyleCheesePizza;
import com.yaokang.patterns.factory.NYStyleCheesePizza;
import com.yaokang.patterns.factory.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("newyorkcheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("chicagocheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
