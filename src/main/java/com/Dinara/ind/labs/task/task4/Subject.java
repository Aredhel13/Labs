package com.Dinara.ind.labs.task.task4;

public class Subject {
    private int idSubject;
    private String subjectName;

    public Subject(int idSubject, String subjectName){
        this.idSubject = idSubject;
        this.subjectName = subjectName;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public String toString() {
        return subjectName;
    }
}
