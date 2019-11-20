package com.Dinara.ind.labs.task.task4;

public class Teacher {
    private String name;
    private int age;
    private String lesson;


    public String getName() {
        return name;
    }

    public Teacher(String name, int age, String lesson)
    {
        this.name = name;
        this.age = age;
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", name = '" + name + '\'' +
                ", age = " + age +
                ", lesson = " + lesson +
                '}';
    }
}
