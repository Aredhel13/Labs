package com.Dinara.lab.task1;

public class CountWord {
    public static void main(String str) {

        String text = "a b c a b cc cc";
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
