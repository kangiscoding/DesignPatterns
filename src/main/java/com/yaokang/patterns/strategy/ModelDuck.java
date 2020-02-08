package com.yaokang.patterns.strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new QuackVoice();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I am a model duck.");
    }
}
