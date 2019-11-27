package com.Dinara.ind.labs.task.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounterFile {
    private Map<String, Integer> words_q = new HashMap<>();

    public static void WordsCounter(String fName, Map<String, Integer> words) throws FileNotFoundException {
        Scanner file = new Scanner(new File(fName));
        while (file.hasNext()){
            String word = file.next();
            Integer count = words.get(word);
            if(count != null)
                count++;
            else
                count =1;
            words.put(word, count);
        }
        file.close();
    }

    public Integer col(String fName,String word) throws FileNotFoundException {
        Map<String, Integer> words = new HashMap<String, Integer>();
        WordsCounter(fName, words);
        System.out.println(words);
        return words.get(word);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> words = new HashMap<String, Integer>();
        WordsCounter("C:\\Users\\Lenovo\\IdeaProjects\\start\\src\\main\\resources\\1.txt", words);
        System.out.println(words);
    }
}
