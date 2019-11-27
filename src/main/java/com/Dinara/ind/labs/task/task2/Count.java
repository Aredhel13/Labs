package com.Dinara.ind.labs.task.task2;


import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Count {

    String text;
    private Map<String, Integer> words_q = new HashMap<>();

    //конструктор
    public Count(String text) {
        this.text = text;
        Counter();
    }

    //переопределение метода
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, Integer> pair : words_q.entrySet()) {
            builder.append(pair.getKey()).append(" : ").append(pair.getValue()).append("\n"); //объединение строк
        }
        return builder.toString();
    }

    //основной метод
    public void Counter() {
        String[] words = text.trim().split(" ");
        for (String word : words) {
            if (!word.equals("")) {
                int count = words_q.getOrDefault(word, 0);
                words_q.put(word, count + 1);
            }
        }
    }

    Map<String,Integer> getWordsStatistic(){return this.words_q;}

    public Integer col(String word){
        System.out.println(words_q);
        return words_q.get(word);
    }

//    public static String ReadFile(String fileName) throws FileNotFoundException {
//        String s = "";
//        Scanner file = new Scanner(new File(fileName));
//        while (file.hasNext()){
//            s = s.concat(" ");
//            s = s.concat(file.next());
// //           System.out.println(s);
//        }
//        file.close();
//        return s;
//    }

    // main
    public static void main(String[] args) throws IOException {
        String text = "i i you you me i me i you";
        String f = "C:\\Users\\Lenovo\\IdeaProjects\\start\\src\\main\\resources\\1.txt";
        Count counter = new Count("a a b b c c a b c dd a");
        counter.Counter();
        System.out.println(counter.toString());
  /*
     System.out.println(ReadFile(f));
        counter.Counter();
        Count counter1 = new Count(ReadFile(f));
        counter1.Counter();
        System.out.println(counter1.toString());
*/
    }


}

