package com.leony.home;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reflection {
    public static class StringList extends ArrayList<String> {}

    public void classLiterals() {
        Injector injector = new Injector().with(123);

        try {
            PersonsList<Person> personsList = injector.newInstance(PersonsList.class);
            personsList.add(PersonFixtures.me);
            personsList.add(PersonFixtures.lisa);
            System.out.println("Generic personList: " + personsList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reflectingTypes() {
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        boolean isEqualClass = integers.getClass() == strings.getClass();
        System.out.println("Generic types are not reflected, we get same ArrayList class for List<Integer> and List<String>. " + isEqualClass);
        List<? extends Number> numbers = new ArrayList<>();
        boolean isEqualClassWildcard = numbers.getClass() == integers.getClass();
        System.out.println("Same for wildcards, List<? extends Number> class is same as List<Integer> -> ArrayList. " + isEqualClassWildcard);
        System.out.println("These types are called non-reifiable types");
    }

    public void reflectingGenericInformation() {
        List<String> strings = new ArrayList<>();
        TypeVariable<? extends Class<? extends List>>[] typeParameters = strings.getClass().getTypeParameters();
        System.out.println("We can get type parameters for a generic Class: " + Arrays.toString(typeParameters));
        System.out.println("We can use a toGenericString() method: " + strings.getClass().toGenericString());

        System.out.println("\nIf we extend a generic class, we can get its type information");
        System.out.println("Get generic superclasses: " + StringList.class.getGenericSuperclass());
        System.out.println("Get superclasses arguments: " + Arrays.toString(((ParameterizedType)StringList.class.getGenericSuperclass()).getActualTypeArguments()));
        System.out.println("Get generic interfaces: " + StringList.class.getGenericInterfaces());
    }
}
