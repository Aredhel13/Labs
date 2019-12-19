package com.Dinara.indiv;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Creater {
    private int id;
    private String name;
    private Map<Integer, Persons> persons = new HashMap<>();

    public Creater() {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Persons> getPersons() {
        return persons;
    }

    public void setPersons(Map<Integer, Persons> persons) {
        this.persons = persons;
    }
//Сериализация
    public void workJSON() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        try {
            // Запись в файл
            FileWriter writer = new FileWriter("src/main/resources/indJSON.txt", false);
            writer.write(json);
            writer.close();
            // Чтение из файла
            Stream<String> streamInfoFromFile = Files.lines(                                    // Получаем Stream из строк(читаем файл построчно в потоке).    lines(Path path , Charset charset(необязательно)).
                    Paths.get("src/main/resources/indJSON.txt"));                                // Для создания экземпляра класса Path, используем статический метод get класса Paths, позволяющего создать путь из строки или URI.
            String info = streamInfoFromFile.collect(Collectors.toCollection(ArrayList::new)).get(0);
            Creater data1 = gson.fromJson(info, Creater.class);
            data1.getPersons().values().forEach(n -> System.out.println(n.getName()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addPersons(Persons persons) {
        this.persons.put(this.persons.size() + 1, persons);
    }


    @Override
    public String toString() {
        return "Creater{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", characters = " + persons +
                '}';
    }


}
