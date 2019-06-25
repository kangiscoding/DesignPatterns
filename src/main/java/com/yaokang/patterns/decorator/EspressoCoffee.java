package com.yaokang.patterns.decorator;

public class EspressoCoffee extends Beverage {

    public EspressoCoffee() {
        description = "EspressoCoffee.";
    }

    public double cost() {
        return 0.1;
    }
}
