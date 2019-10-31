package com.Dinara.ind.labs.task.task4;

import java.util.*;

public class Group {
    private Student[] students; //массив студентов

    public Group(Student[] student){
        this.students = student;
    }

    // добавляем в массив нового студента
    public void addStudent(Student student){
        students = Arrays.copyOf(students,students.length+1);
        students[students.length] = student;    //в конец записываем нового студента
    }


    @Override
    public String toString(){
        return Arrays.toString(students);
    }

    public static void main(String[] args) {
        // Создаем студентов
        Student S1 = new Student("Denis",21, "App math", 41);
        Student S2 = new Student("Hieu", 21,"App math", 42);
        Student S3 = new Student("Dinara", 21,"App math", 42);
        Student S4 = new Student("Sofia", 21,"App math", 42);
        Student S5 = new Student("Nik", 22,"Math", 20);

        Group g1 = new Group( new Student[] {S1});  //создаем группу, в которую помещаем студентов
        Group g2 = new Group( new Student[] {S2, S3, S4});
        Group g3 = new Group( new Student[] {S5});

    }
}
