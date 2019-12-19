package com.Dinara.ind.labs.task.task4;

public class Student {

    private String name;
    private int id;

    //чтобы получить доступ к приватным переменным
    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


//
//    private boolean hasStudents(){
//        for (Student student : allStudents.values()){
//            if (student.equals(this) && student.hashCode() == this.hashCode()){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    //сравниваем
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age &&
//                Objects.equals(name, student.name) &&
//                faculty == student.faculty &&
//                codegroup == student.codegroup;
//    }
//
//    //проверяем есть ли объект в списке
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, faculty, codegroup);
//    }
//

}
