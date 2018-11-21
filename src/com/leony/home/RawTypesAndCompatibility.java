package com.leony.home;

import java.util.ArrayList;
import java.util.List;

public class RawTypesAndCompatibility {
    public void rawTypes() {
        List list = new ArrayList(); // legacy list
        list.add("123");
        list.add(123);
        list.add(new Object());

        List<String> strings = new ArrayList<>();
        strings = list;

        /*
         Will throw ClassCastException: Integer cannot be cast to String
        for (String item : strings) {
            System.out.println(item);
        }
        */
    }

    public void implicationsOfErasure() {
        System.out.println("Method overloading; overload method with generic list because of erasure. See 'print' method");
        System.out.println("We cannot check instanceof with generic class, e.g. o instanceof Person<String> -> compiler error");
        System.out.println("We cannot catch exceptions with generic exception class, e.g. catch (MyException<String>) -> compiler error");
    }

    public void print(List<String> list) {}

    /* Compiler error: cannot overload method with generics
    public void print(List<Integer> list) {}
     */
}
