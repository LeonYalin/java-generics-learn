package com.leony.home;

import java.util.*;

public class GenericCollections {
    public void playWithGenericCollections() {
        List<Person> personList = new ArrayList<>();
        Collections.addAll(personList, PersonFixtures.me, PersonFixtures.nelly);
        System.out.println("Use list on persons: <Person> generic class. " + personList);

        Set<Person> personSet = new HashSet<>();
        Collections.addAll(personSet, PersonFixtures.me, PersonFixtures.nelly);
        System.out.println("Use set on persons: <Person> generic class. " + personSet);

        Map<String, Person> personMap = new HashMap<>();
        personMap.put("me", PersonFixtures.me);
        personMap.put("nelly", PersonFixtures.nelly);
        personMap.put("lisa", PersonFixtures.lisa);
        System.out.println("Use map on persons: <Person> generic class. " + personMap);
    }
}
