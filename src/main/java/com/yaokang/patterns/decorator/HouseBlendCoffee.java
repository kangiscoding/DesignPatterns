package com.yaokang.patterns.decorator;

public class HouseBlendCoffee extends Beverage {

    public HouseBlendCoffee() {
        description = "HouseBlendCoffee.";
    }

    public double cost() {
        return 0.2;
    }
}
