package com.yaokang.patterns.test;

public class Man extends Human {

    public Man() {
        super();
    }

    public void add(int key, int value) {
        map.put(key, value);
    }

    public void print() {
        System.out.println("For man, map size: " + map.size());
    }

    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();

        man.add(1,1);
        woman.add(2,2);
        woman.add(3,3);

        man.print();
        woman.print();

    }
}
