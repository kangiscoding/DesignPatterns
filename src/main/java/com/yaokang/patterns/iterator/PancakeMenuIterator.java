package com.yaokang.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeMenuIterator implements Iterator {

    List<MenuItem> list;
    int position = 0;

    public PancakeMenuIterator(List<MenuItem> list) {
        this.list = new ArrayList<>();
    }

    @Override
    public boolean hasNext() {
        if (position <= list.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        if (position < list.size()) {
            MenuItem menuItem = list.get(position);
            position++;
            return menuItem;
        }
        return null;
    }
}
