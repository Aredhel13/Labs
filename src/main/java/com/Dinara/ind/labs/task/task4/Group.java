package com.Dinara.ind.labs.task.task4;

import java.util.ArrayList;
import java.util.List;

public class Group {
    List<Student> students;//массив студентов
    int groupNumber;
    private int id;

    public Group(int id, List<Student> students, int groupNumber) {
        this.students = new ArrayList<>(students);
        this.groupNumber = groupNumber;
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getId() {
        return id;
    }
}
