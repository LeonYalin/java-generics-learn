package com.leony.home;

import java.io.Closeable;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AdvancedTopics {
    public void functionalInterfaces() {
        Predicate<Person> isOld = person -> person.getAge() > 31;

        System.out.println("Using Predicate<Person> to test persons:");
        System.out.println("Lisa is old: " + isOld.test(PersonFixtures.lisa));
        System.out.println("Leon is old: " + isOld.test(PersonFixtures.me));

        List<Person> persons = Arrays.asList(PersonFixtures.me, PersonFixtures.nelly, PersonFixtures.nelly);
        Map<Boolean, List<Person>> youngAndOldPersons = persons.stream().collect(Collectors.partitioningBy(isOld));
        System.out.println("\nUsing stream API and partitioningBy predicate:\n" + youngAndOldPersons);
        Map<Boolean, Long> youngAndOldPersonsCount = persons.stream().collect(Collectors.partitioningBy(isOld, Collectors.counting()));
        System.out.println("\nUsing stream API and partitioningBy predicate with count:\n" + youngAndOldPersonsCount);
    }

    public void intersectionTypes() {
        System.out.println("Using generics intersection types - multi-typed generics");
        List<GoodPerson> persons = new ArrayList<>();
        persons.add(PersonFixtures.dad);
        persons.add(PersonFixtures.bro);
        print(persons);
    }

    private <T extends Person & Closeable> void print(List<T> persons)  {
        persons.forEach(System.out::println);
    }
}
