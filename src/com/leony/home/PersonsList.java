package com.leony.home;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonsList<T> implements Iterable<T> {
    private List<T> personsList = new ArrayList<>();

    public void add(T person) {
        personsList.add(person);
    }

    public int size() {
        return personsList.size();
    }

    public T get(int index) {
        return personsList.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return personsList.iterator();
    }
}
