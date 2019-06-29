package com.yaokang.patterns.command;

public class Light {

    String type = "default light";

    public Light(String type) {
        this.type = type;
    }

    public void on() {
        System.out.println(type + "is on.");
    }

    public void off() {
        System.out.println(type + "is off.");
    }
}
