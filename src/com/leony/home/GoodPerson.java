package com.leony.home;

public class GoodPerson extends Person {
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
}
