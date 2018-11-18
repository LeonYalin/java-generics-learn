package com.leony.home;

import java.util.Comparator;

public class PersonComparatorReversed<T> implements Comparator<T> {
    private Comparator<T> delegateComparator;

    public PersonComparatorReversed(Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    @Override
    public int compare(T left, T right) {
        return -1 * delegateComparator.compare(left, right);
    }
}
