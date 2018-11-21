package com.leony.home;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Injector {
    private Map<Class<?>, Object> objectMap = new HashMap<>();

    public <T> Injector with(T variable) {
        objectMap.put(variable.getClass(), variable);
        return this;
    }

    public <T> T newInstance(Class<T> className) throws Exception {
        Constructor<?>[] constructors = className.getConstructors();

        // java 8 way
        //return (T) objectMap.computeIfAbsent(className, this::instantiate);

        return instantiate(className, constructors);
    }

    private <T> T instantiate(Class<T> className, Constructor<?>[] constructors) throws Exception {
        if  (objectMap.containsValue(className)) {
            return (T)objectMap.get(className);
        }

        if (constructors.length != 1) {
            throw new IllegalArgumentException("more than one constructor");
        }

        return (T)constructors[0].newInstance();
    }
}
