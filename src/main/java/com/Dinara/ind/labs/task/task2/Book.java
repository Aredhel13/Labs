package com.Dinara.ind.labs.task.task2;

public class Book {
    private static String author = "Jane Ostin";
    private static String name = "Pried and Prejudice";
    private static int  year = 1813;


    public static void main(String[] args) {
        print(year, author);
    }

    private static String print(int t, String str1){
        System.out.println("Имя автора - " + str1);
        System.out.println("Колличество страниц - " + t);
        return null;
    }
}
