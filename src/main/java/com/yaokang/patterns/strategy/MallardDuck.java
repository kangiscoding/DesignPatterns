package com.yaokang.patterns.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithThings();
    }

    public void display() {
        System.out.println("I am a real duck.");
    }
}
