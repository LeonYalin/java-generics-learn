package com.leony.home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericClassesAndInterfaces {
    public void implementingAGenericType() {
        List<Person> persons = new ArrayList<>();
        Collections.addAll(persons, PersonFixtures.me, PersonFixtures.nelly, PersonFixtures.lisa);
        System.out.println("Using a custom comparator that implements generic interface to sort a persons list");
        Collections.sort(persons, new PersonComparator());
        System.out.println(persons);
    }

    public void passingAParameterToAGenericType() {
        List<Person> persons = new ArrayList<>();
        Collections.addAll(persons, PersonFixtures.me, PersonFixtures.nelly, PersonFixtures.lisa);
        System.out.println("Using a custom comparator that reuses an existing comparator to modify its behavior: reverse order");
        Collections.sort(persons, new PersonComparatorReversed<>(new PersonComparator()));
        System.out.println(persons);
    }

    public void typeBounds() {
        SortedPair sortedPair = new SortedPair(PersonFixtures.me, PersonFixtures.nelly);
        System.out.println("Using typed generics: extends comparable." + sortedPair);
        System.out.println("TDD: open and run SortedPair class tests");
    }
}
