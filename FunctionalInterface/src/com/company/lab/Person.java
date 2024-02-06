package com.company.lab;

public class Person {
    private final String name;
    private final Integer age;

    public Person(String name, Integer age, double v) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
