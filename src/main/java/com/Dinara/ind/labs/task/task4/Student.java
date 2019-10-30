package com.Dinara.ind.labs.task.task4;

import java.util.*;

public class Student {
    private int id;
    private String name;
    private int age;
    private String faculty;
    private int codegroup;
    private static Map <Integer, Student> allStudents;
    private static int countId = 0;

    public Student(String name, int age, int codegroup)
    {
        if (allStudents == null){
            allStudents = new HashMap<>();
        }

        this.name = name;
        this.age = age;
        this.codegroup = codegroup;

        if (!hasStudents()){
            countId++;
            this.id = countId;
            allStudents.put(id, this);
        }
    }

    private boolean hasStudents(){
        for (Student student : allStudents.values()){
            if (student.equals(this) && student.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }

    //сравниваем
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                codegroup == student.codegroup;
    }

//проверяем есть ли объект в списке

    @Override
    public int hashCode() {

        return Objects.hash(name, age, codegroup);
    }

    public String Info() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", codegroup=" + codegroup +
                '}';
    }


}
