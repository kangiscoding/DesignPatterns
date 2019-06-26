package com.yaokang.patterns.factory.factorymethod;

import com.yaokang.patterns.factory.Pizza;

public class FactoryMethodSimulation {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        // new york style
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza = nyStore.orderPizza("veggie");
        System.out.println(pizza.getName());

        // chicago style
        Pizza pizza1 = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza1 = chicagoStore.orderPizza("veggie");
        System.out.println(pizza.getName());

    }
}
