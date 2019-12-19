package com.Dinara.indiv;

import org.jetbrains.annotations.NotNull;

import java.util.*;

class Persons{
    private String clan;
    private String name;
    private Map<Integer, Info> infoOfPersons = new HashMap<>();

    public Persons(String name, String clan) {
        this.name = name;
        this.clan = clan;
    }

    public void outInfo(List<Creater> squads) {
        System.out.println("Имя : " + name + "\n");
        System.out.println("Клан : " + clan + "\n");
        for (Creater squad : squads) {
            assert this.getInfoOfPersons().containsKey(squad.getId());
            System.out.println("\t Статус : " + squad.getName() + "\n");
            System.out.println("\t Роль : " + infoOfPersons.get(squad.getId()).getInfo() + "\n\n");
            for (Persons characters : squad.getPersons().values()) {
                Info info = characters.getInfoOfPersons().get(squad.getId());
                if (info.getCode() == 0)
                    System.out.println("Капитан отряда : " + characters.getName());
            }
            for (Persons persons : squad.getPersons().values()) {
                Info info = persons.getInfoOfPersons().get(squad.getId());
                if ((info.getPersons() != null) && ((info.getPersons().contains(this))))
                    System.out.println("Его Капитан : " + persons.getName());
            }
        }
    }

    public Map<Integer, Info> getInfoOfPersons() {
        return infoOfPersons;
    }

    public String getName() {
        return name;
    }

    public void addSquad(@NotNull Creater squad, double idsquad) {
        this.infoOfPersons.put(squad.getId(), new Info(idsquad));
    }

    public Set<Persons> findLeaders(@NotNull List<Creater> squads) {
        Set<Persons> res = new HashSet<>();
        for (Creater squad : squads) {
            assert this.getInfoOfPersons().containsKey(squad.getId());
            for (Persons characters1 : squad.getPersons().values()) {
                if ((characters1.getInfoOfPersons().get(squad.getId()).getPersons() != null) &&
                        (characters1.getInfoOfPersons().get(squad.getId()).getPersons().contains(this)))
                    res.add(characters1);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "Characters{" +
                ", clan='" + clan + '\'' +
                ", name='" + name + '\'' +
                ", infoOfPersons=" + infoOfPersons +
                '}';
    }
}