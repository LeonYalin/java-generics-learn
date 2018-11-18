package com.leony.home;

public class SortedPair<T extends Comparable<T>> {
    private T first;
    private T second;

    public SortedPair(T first, T second) {
        sortPair(first, second);
    }

    private void sortPair(T first, T second) {
        if (first.compareTo(second) < 0) {
            this.first = first;
            this.second = second;
        } else {
            this.first = second;
            this.second = first;
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("SortedPair{first=%s, second=%s}", first, second);
    }
}
