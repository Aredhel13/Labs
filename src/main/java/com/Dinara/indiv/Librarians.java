package com.Dinara.indiv;

public class Librarians {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Librarians(String name, int age)
    {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
