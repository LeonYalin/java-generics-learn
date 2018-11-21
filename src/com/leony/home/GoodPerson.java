package com.leony.home;

import java.io.Closeable;
import java.io.IOException;

public class GoodPerson extends Person implements Closeable {
    String hobby;

    public GoodPerson(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return String.format("GoodPerson{name=%s, age=%s, hobby=%s}", name, age, hobby);
    }

    @Override
    public void close() throws IOException {}
}
