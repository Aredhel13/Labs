package com.Dinara.ind.labs.task.task4;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Schedule {
    @Test
    public void lessonTest() {
        Lesson[] lessons1;
        Student studentAnna = new Student(1, "Anna");
        Student studentIvan = new Student(2, "Ivan");

//        Group group42 = createGroup(42);
//        Group group41 = createGroup(41);

        Group group1 = new Group(1, Arrays.asList(studentAnna),41);
        Group group2 = new Group(2, Arrays.asList(studentIvan),42);

        Teacher kostenko = new Teacher("Костенко");
        Teacher sinitsa = new Teacher("Синица");
        Teacher lebedeva = new Teacher("Лебедева");
        Teacher podkolzin = new Teacher ("Подколзин");
        Teacher bessarabov = new Teacher("Бессарабов");
        Teacher zanin = new Teacher("Занин");
        Teacher golovin = new Teacher("Головин");
        Teacher garkusha = new Teacher("Гаркуша");

        LocalTime firstLessonTime = LocalTime.of(8,0,0);
                LocalTime secondLessonTime = LocalTime.of(9,40,0);
        LocalTime thirdLessonTime = LocalTime.of(11,30,0);
        LocalTime fourthLessonTime = LocalTime.of(13,10,0);


        Subject prolog = new Subject(1, "Prolog");
        Subject java = new Subject(2, "Java");
        Subject web = new Subject(3, "Web");
        Subject delphi = new Subject(3, "Delphi");
        Subject oracle = new Subject(3, "Oracle");

        Lesson pLesson1 = new Lesson(web, DayOfWeek.MONDAY, firstLessonTime,group1, sinitsa, 1);
        Lesson pLesson2 =new Lesson(web, DayOfWeek.MONDAY, secondLessonTime, group2, sinitsa, 2);
                //Вторник
        Lesson vLesson1 =new Lesson(prolog, DayOfWeek.TUESDAY, firstLessonTime, group1, lebedeva, 1);
        Lesson vLesson2 =new Lesson(delphi, DayOfWeek.TUESDAY, secondLessonTime, group2, podkolzin, 2);
        Lesson vLesson3 =new Lesson(oracle, DayOfWeek.TUESDAY, thirdLessonTime, group1, bessarabov, 3);

        lessons1 = new Lesson[] {pLesson2,vLesson2};
        Timetable schedule1 = new Timetable(Arrays.asList(lessons1));
//        System.out.println(pLesson2);
//        lessons1 = new Lesson[] {vLesson1,vLesson2, vLesson3};
//    Timetable schedule2 = new Timetable(Arrays.asList(lessons1));
//        System.out.println("Before");
//        System.out.println(schedule1);
//        System.out.println("After");
        assertEquals(Arrays.asList(pLesson2, vLesson2), schedule1.findLessons(studentIvan));

//        System.out.println(schedule1);
    }
}
