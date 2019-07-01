package com.yaokang.patterns.iterator;

public class Waiter {

    Menu pancakeMenu;
    Menu dinerMenu;

    public Waiter(Menu pancakeMenu, Menu dinerMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        //print(pancakeIterator);
        print(dinerIterator);
    }

    public void print(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getDescription());
        }
    }
}
