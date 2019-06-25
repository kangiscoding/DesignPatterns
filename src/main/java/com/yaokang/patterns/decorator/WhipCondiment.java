package com.yaokang.patterns.decorator;

public class WhipCondiment extends Condiment {

    Beverage beverage;

    public WhipCondiment(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", WhipCondiment";
    }

    public double cost() {
        return 0.4 + beverage.cost();
    }
}
