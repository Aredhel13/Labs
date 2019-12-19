package com.Dinara.indiv;

import java.util.ArrayList;

public class Main extends Creater {
    private int choose;
    private String name;
    private ArrayList<Info> tablePerson = new ArrayList<>();

    public ArrayList<Info> getTablePerson(){
        return tablePerson;
    }

    public Main(int choose, String name){
        super();
        this.choose = choose;
        this.name = name;
        getMain();
    }

    private void getMain() {
        Creater creater = new Creater();
 //       creater.createInfo();

        creater.addPersons(new Persons("Рукия","Кучики"));
        creater.addPersons(new Persons( "Бьякуя", "Кучики"));
        creater.addPersons(new Persons("Гин","Итимару"));
//        if (choose == 1){
//            System.out.println("Техники:");
//            Squad villageCharacter = find(creater.getName(), name);
//            for (Info info : info.getInfos()) {
//                if (Arrays.stream(info.getCode()).anyMatch(villages1 -> villages1 == villageCharacter)) {
//                    tablePerson.add(info);
//                    System.out.println("\t" + info.getNumber() + ". " + info.getTechnics() + "\n");
//                }
//            }
//        }
    }

//    private Squad find(Squad[] squads, int name) {
//        for (Squad squad : squads)
//            for (Persons person : squads.getPersons)
//                if (person.getName().equals(name)) return squad;
//                return null;
//    }

    public static void main(String[] args) {
        Main main = new Main(1,"Саске");
    }
}
