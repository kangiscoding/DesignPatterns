package com.yaokang.patterns.adapter;

public class WildTurkey implements Turkey {

    public void gobble() {
        System.out.println("WildTurkey gobble");
    }

    public void fly() {
        System.out.println("WildTurkey fly");
    }

}
