package com.epam.rd.autocode.decorator;

import java.util.*;

public class EventWithNumbers extends AbstractList {

    private final List<String> source;

    public EventWithNumbers(List<String> source) {
        this.source = source;
    }

    @Override
    public Object get(int index) {
        return source.get(index * 2);
    }

    @Override
    public int size() {
        return source.size() % 2 == 0 ? source.size() / 2 : source.size() / 2 + 1;
    }
}
