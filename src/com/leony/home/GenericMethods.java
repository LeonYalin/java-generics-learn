package com.leony.home;

import java.util.*;

public class GenericMethods {
    public void playWithGenericMethods() {
        List<Person> persons = Arrays.asList(PersonFixtures.me, PersonFixtures.nelly, PersonFixtures.lisa);
        Person minPerson = min(persons, new PersonComparator());
        System.out.println("Using generic method to find min Person: " + minPerson);

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Integer minNumber = min(numbers, Integer::compare);
        System.out.println("Using SAME generic method to find min number: " + minNumber);
    }

    private <T> T min(List<T> items, Comparator<T> comparator) {
        if (items.size()  < 2) {
            throw new IllegalArgumentException("Number of parameters must be at least 2");
        }

        T min = items.get(0);
        for (int i = 1; i < items.size(); i++) {
            T item = items.get(i);
            if (comparator.compare(item, min) < 0) {
                min = item;
            }
        }

        return min;
    }
}
