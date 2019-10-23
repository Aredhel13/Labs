package com.Dinara.ind.labs.task.task3;

public abstract class Parent {
    int a=1;
    public void print(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        new Child().print();
    }
}

//Опишем факультет: студенты и преподаватели, группы, расписание, предметы, их свойства.
// Составить объектную модель факультета.
// И написать тест(Генерация данных в тесте). Отчет для конкретного студента: расписание предметов, преподавателей
