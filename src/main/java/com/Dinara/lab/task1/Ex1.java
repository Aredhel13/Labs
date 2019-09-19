package com.Dinara.lab.task1;

public class Ex1 {
    private static String text = "a b c a b cc cc";

    public static void main(String[] args) {
        count(text);
    }

    public static void count(String str) {
        int i = 0;
        int c = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            i++;
        }
        for (int j = 0; j < i - 1; j++) {
            for (int k = j + 1; k < i; k++) {
               if (!words[j].equals(" ")) {
                    if (words[j].equals(words[k])) {
                        c++;
                        words[k] = " ";
                    }
                }
            }
            if (!words[j].equals(" "))
                System.out.println(words[j] +" - " + (c+1));
            c=0;
        }
        if (!words[i-1].equals(" "))
            System.out.println(words[i] +" - " + 1);
    }
}

