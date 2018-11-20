package com.leony.home;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public void playWithWildcards() {
        List<Person> persons = new ArrayList<>();
        persons.add(PersonFixtures.me);
        persons.add(PersonFixtures.nelly);
        System.out.println("Print persons base class using upper bound wildcard");
        printPersons(persons);

        List<GoodPerson> subPersons = new ArrayList<>();
        subPersons.add(PersonFixtures.bro);
        subPersons.add(PersonFixtures.dad);
        System.out.println("\nPrint persons sub class: goodPerson using upper bound wildcard");
        printPersons(subPersons);

        System.out.println("\nAdd new persons and sub persons to the list using lower bound wildcard");
        addPersons(persons);
        printPersons(persons);

        System.out.println("Using unbounded wildcard '?' for representing unknown types, e.g Class.for name('name')");
        try {
            Class<?> personClass = Class.forName("com.leony.home.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    /**
     * The get principle
     */
    private void printPersons(List<? extends Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    /*
     * The put principle
     */
    private void addPersons(List<? super Person> persons) {
        persons.add(PersonFixtures.me); // a person
        persons.add(PersonFixtures.bro); // a GoodPerson
    }
}
