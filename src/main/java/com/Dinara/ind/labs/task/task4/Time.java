package com.Dinara.ind.labs.task.task4;

import java.time.LocalTime;
import java.util.*;

public class Time {
    public static void timeTable(int[] data) {
        NameLesson[] nameLessons = NameLesson.values();
        LocalTime time = LocalTime.of(data[0], data[1]);
        System.out.println(nameLessons[0] + " пара");
        System.out.println("\tначало: " + time.toString());
        for (int i = 0; i < data[4]; i++) {
            time = time.plusMinutes(data[2]);
            System.out.println("\tконец:  " + time.toString());
            System.out.println(nameLessons[i + 1] + " пара");
            time = time.plusMinutes(data[3]);
            System.out.println("\tначало: " + time.toString());
        }
        time = time.plusMinutes(data[2]);
        System.out.println("\tконец:  " + time.toString());
    }

//    public static int[] inputData() {
//       int[] data = new int[5];
//       data[0] =
//        System.out.print("Введите время начала пары: (например, 8:30) ");
//        String[] strTime = scanner.nextLine().split(":");
////        data[0] = Integer.parseInt(strTime[0]);
////        data[1] = Integer.parseInt(strTime[1]);
//        System.out.print("Длительность пары: ");
////        data[2] = scanner.nextInt();
//        System.out.print("Длительность перерыва: ");
////        data[3] = scanner.nextInt();
////        System.out.print("Количество пар: ");
////        data[4] = scanner.nextInt() - 1;
//        return data;
//    }

    enum NameLesson {
        Первая, Вторая, Третья, Четвёртая, Пятая, Шестая, Седьмая, Восьмая
    }

    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
       // int[] lessonOption = inputData();
 //       timeTable(lessonOption);
       // scanner.close();
    }
}
