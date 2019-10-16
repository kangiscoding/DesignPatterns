package com.yaokang.patterns.test;

public class Woman extends Human {

    public Woman() {
        super();
    }

    public void add(int key, int value) {
        map.put(key, value);
    }

    public void print() {
        System.out.println("For woman, map size: " + map.size());
    }
}
