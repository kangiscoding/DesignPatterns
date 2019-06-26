package com.yaokang.patterns.factory.factorymethod;

import com.yaokang.patterns.factory.NYStyleCheesePizza;
import com.yaokang.patterns.factory.NYStyleVeggiePizza;
import com.yaokang.patterns.factory.Pizza;

public class NYStylePizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
