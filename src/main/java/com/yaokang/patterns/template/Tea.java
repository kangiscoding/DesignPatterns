package com.yaokang.patterns.template;

public class Tea extends CaffeineBeverage {

    public void brew() {
        System.out.println("Brew tea");
    }

    public void addCondiments() {
        System.out.println("Add tea condiments");
    }
}
