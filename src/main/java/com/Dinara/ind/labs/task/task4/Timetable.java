package com.Dinara.ind.labs.task.task4;

import java.util.ArrayList;
import java.util.List;


public class Timetable {
    private List<Lesson> lessons;

    public Timetable(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Lesson> findLessons(Student student) {
        List<Lesson> lessons1 = new ArrayList<>();
        for (Lesson lesson : lessons) {
            for (Student student1 : lesson.getGroup().getStudents()) {
                if (student1.getName().equals(student.getName()))
                    lessons1.add(lesson);
            }
        }
        outPut(lessons1);
        return lessons1;
    }

    public void outPut(List<Lesson> lessons) {
        for (Lesson lesson : lessons) {
            System.out.println("\t --------------------------------");
            System.out.println("\t " + lesson.getSubject());
            System.out.println("\t " + lesson.getLocalTime());
            System.out.println("\t " + lesson.getGroup().getGroupNumber());
            System.out.println("\t " + lesson.getTeacher().getName());
            System.out.println();
        }
    }
}