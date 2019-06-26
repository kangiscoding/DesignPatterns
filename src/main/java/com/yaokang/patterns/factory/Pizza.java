package com.yaokang.patterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough... ");
        System.out.println("Adding sauce... ");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 20 minutes.");
    }

    public void cut() {
        System.out.println("Cut into slices.");
    }

    public void box() {
        System.out.println("Place pizza in box.");
    }

    public String getName() {
        return this.name;
    }

}
