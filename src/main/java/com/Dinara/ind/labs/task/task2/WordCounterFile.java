package com.Dinara.ind.labs.task.task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounterFile {
    private Map<String, Integer> words_q = new HashMap<>();
    private String pathDir;
    private Map<String,Integer> wordsStatistic;

    public Map<String,Integer> getWordsStatistic(){
        return this.wordsStatistic;
    }

    public WordCounterFile(String pathDir) throws IOException {
        this.pathDir = pathDir;
        this.wordsStatistic = solution();
    }

    public Integer col(String word){
        return wordsStatistic.get(word);
    }

    private Map<String, Integer> solution() throws IOException {
        Map<String,Integer> info = new HashMap<>();
        File folder = new File(pathDir);
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println("Читаем файл файл: " + file.getName());
                // Получаем Stream из строк(читаем файл построчно в потоке).    lines(Path path , Charset charset(необязательно)).
                // Для создания экземпляра класса Path, используем статический метод get класса Paths, позволяющего создать путь из строки или URI.
                Stream<String> streamInfoFromFile = Files.lines(Paths.get(pathDir+file.getName()));
                ArrayList<String> infoFromFile = streamInfoFromFile.collect(Collectors.toCollection(ArrayList::new));
                for (String s : infoFromFile){
                    Count wordCounter = new Count(s);
                    info = joinMaps(info, wordCounter.get_words_col());
                }
            }
        }
        return info;
    }

    private Map<String, Integer> joinMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String,Integer> mapResult = new HashMap<>();
        if (map1 == null || map2 == null){throw new NullPointerException("One of maps is null");}
        if (map1.isEmpty()) return map2;
        if (map2.isEmpty()) return map1;

        mapResult = map1;
        for(String s: map2.keySet()){
            int count = mapResult.getOrDefault(s, 0);
            mapResult.put(s,count+map2.get(s));
        }
        return mapResult;
    }
}
