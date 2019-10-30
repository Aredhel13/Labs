package com.Dinara.ind.labs.task.task2;


public class Count {

    public static void main(String[] args) {
        String strl = "i i you you me i me i you";
        count(strl);
    }
    public static int count (String text)
    {
        String[] words = text.trim().split(" ");
        for (String word : words){
            System.out.println(word+": "+find(words,word));
        }
        return 0;
    }


    private static int find (String[] words, String w) {
        int count = 0;
        for(String word : words){
            if (word.equals(w)) {
                count++;
            }
        }
        return count;
    }
}
