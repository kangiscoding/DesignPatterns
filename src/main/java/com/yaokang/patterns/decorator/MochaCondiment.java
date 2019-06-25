package com.yaokang.patterns.decorator;

public class MochaCondiment extends Condiment {

    Beverage beverage;

    public MochaCondiment(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", MochaCondiment";
    }

    public double cost() {
        return 0.3 + beverage.cost();
    }
}
