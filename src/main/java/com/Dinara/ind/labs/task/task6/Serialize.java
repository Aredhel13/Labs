package com.Dinara.ind.labs.task.task6;

import java.io.*;

public class Serialize implements Serializable {

    private static int[] datafile;

    // Генерация рандомного значения
    private static int r() {
        return (int) (Math.random() * 10);
    }

    // Конструктор
    private Serialize() {
        datafile = new int[r()];
        for (int i = 0; i < datafile.length; i++)
            datafile[i] = r();
    }

    private static void printout() {
        System.out.println("This RandomClass has " + datafile.length + " random integers");
        for (int value : datafile) {
            System.out.print(value);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Serialize s = new Serialize();
        printout();
        }
    }
