package com.Dinara.indiv;

public class Book {
    private String author;
    private String name;
    private int year;
    private int numberOfBooks;
    private Readers reader;

    public Book(String author,String name, int year,int numberOfBooks,Readers reader)
    {
        this.author = author;
        this.name = name;
        this.year = year;
        this.numberOfBooks = numberOfBooks;
        this.reader = reader;

    }
}
