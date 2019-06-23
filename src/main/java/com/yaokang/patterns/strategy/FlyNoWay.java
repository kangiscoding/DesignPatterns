package com.yaokang.patterns.strategy;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I can not fly.");
    }
}
