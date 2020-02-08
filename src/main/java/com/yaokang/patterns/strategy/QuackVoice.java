package com.yaokang.patterns.strategy;

public class QuackVoice implements QuackBehavior {

    public void quack() {
        System.out.println("QuackVoice.");
    }
}
