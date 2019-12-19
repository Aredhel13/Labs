package com.Dinara.indiv;

import java.util.ArrayList;
import java.util.List;

public class Info {
    private double code;
    private List<String> Position = new ArrayList<>();
    private String info;
    private List<Persons> persons;

    public Info(double code) {
        this.code = code;

        if (code == 0) {
            info = "Капитан";
            Position.add("Карательный отряд");
            Position.add("Контроль");
            persons = new ArrayList<>();
        }

        if (code == 1.0) {
            info = "Лейтенант";
            Position.add("Охрана капитана");
            Position.add("Защита Сейрейтей");
            Position.add("Защита душ от пустых");
            persons = new ArrayList<>();
        }


        if (code == 2.0) {
            info = "Рядовой";
            Position.add("Подчинение приказам");
            Position.add("Тренировки");
            persons = new ArrayList<>();
        }

    }

    public double getCode() {
        return code;
    }

    public List<Persons> getPersons() {
        return persons;
    }

    public void setPersons(List<Persons> persons) {
        this.persons = persons;
}

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Info{" +
                "code=" + code +
                ", Position=" + Position +
                ", info='" + info + '\'' +
                ", characters=" + persons +
                '}';
    }
}
