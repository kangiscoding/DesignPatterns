package com.yaokang.patterns.strategy;

public class QuackMute implements QuackBehavior {

    public void quack() {
        System.out.println("Silence.");
    }

}
