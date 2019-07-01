package com.yaokang.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeMenu implements Menu {

    List<MenuItem> list;

    public PancakeMenu() {
        list = new ArrayList<>();
        addItem("iterm1", "pancake_des_1", true, 5.0);
        addItem("iterm2", "pancake_des_2", true, 6.0);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        list.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new PancakeMenuIterator(list);
    }
}
