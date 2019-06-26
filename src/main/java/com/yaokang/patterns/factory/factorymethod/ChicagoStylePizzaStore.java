package com.yaokang.patterns.factory.factorymethod;

import com.yaokang.patterns.factory.ChicagoStyleCheesePizza;
import com.yaokang.patterns.factory.ChicagoStyleVeggiePizza;
import com.yaokang.patterns.factory.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }

}
