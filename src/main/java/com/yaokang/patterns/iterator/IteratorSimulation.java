package com.yaokang.patterns.iterator;

public class IteratorSimulation {

    public static void main(String[] args) {

        Menu pancakeMenu = new PancakeMenu();
        Menu dinerMenu = new DinerMenu();

        Waiter waiter = new Waiter(pancakeMenu, dinerMenu);
        waiter.printMenu();
    }
}
