package com.Dinara.ind.labs.task.task4;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Lesson {
    private LocalTime localTime;
    private Group group;
    private Subject subject;
    private Teacher teacher;
    private DayOfWeek dayOfWeek;
    private int number;

    //передача данных о занятиях
    public Lesson(Subject subject, DayOfWeek dayOfWeek, LocalTime localTime,
                  Group group, Teacher teacher, int number){
        this.localTime = localTime;
        this.dayOfWeek = dayOfWeek;
        this.group = group;
        this.subject = subject;
        this.teacher = teacher;
        this.number = number;
    }

    //get
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Group getGroup() {
        return group;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public int getNumber() {
        return number;
    }

    public Subject getSubject() {
        return subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    //предметы
//    public enum Subject {
//        Clojure,
//        Delphi,
//        Java,
//        Oracle,
//        Prolog,
//        Web
//    }


//    public void addGroup(Group group){
//        groups = Arrays.copyOf(groups, groups.length+1);
//        groups[groups.length] = group;
//    }
//
//    @Override
//    public String toString(){
//        return String.format("%n"+"Day: " + day +
//                "%n"+"Lesson: " +
//                lesson + "%n"+"Time: " +
//                time +"%n" + "Teacher: " +
//                teacher +"%n");
//    }
//
//    public static void main(String[] args) {
//
//        Teacher T1 = new Teacher("Garkusha", 49, "Java");
//        Teacher T2 = new Teacher("Zanin", 32, "Oracle");
//
//        Student S1 = new Student("Denis",21, "App math", 41);
//        Student S2 = new Student("Hieu", 21,"App math", 42);
//        Student S3 = new Student("Dinara", 21,"App math", 42);
//        Student S4 = new Student("Sofia", 21,"App math", 42);
//        Student S5 = new Student("Nik", 22,"Math", 20);
//
//        Group g1 = new Group( new Student[] {S1});  //создаем группу, в которую помещаем студентов
//        Group g2 = new Group( new Student[] {S2, S3, S4});
//        Group g3 = new Group( new Student[] {S5});
//
//
//        ScheduleLesson SL1 = new ScheduleLesson(new Group[] {g1}, T1.getName(),"Java","08:00", "Monday");
//        ScheduleLesson SL2 = new ScheduleLesson(new Group[] {g2}, T2.getName(),"Oracle","09:40", "Tuesday");
//        ScheduleLesson SL3 = new ScheduleLesson(new Group[] {g3}, T1.getName(),"Java","11:30","Friday");
//
//        System.out.printf("Student:" + S2 + "%n");
//        System.out.print(SL2);
//
//    }

}

