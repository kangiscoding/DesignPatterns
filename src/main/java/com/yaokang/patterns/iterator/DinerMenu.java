package com.yaokang.patterns.iterator;

public class DinerMenu implements Menu {

    static final int MAX_ITERMS = 6;
    int numberOfIterms = 0;

    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITERMS];
        addItem("iterm1", "diner_des_1", true, 5.0);
        addItem("iterm2", "diner_des_2", true, 6.0);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfIterms >= MAX_ITERMS) {
            System.out.print("error");
        } else {
            menuItems[numberOfIterms] = menuItem;
            numberOfIterms++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
