package com.bookshelf.library.beans;

public class Book {
    private String message;
    private String name;

    public Book(){
        System.out.println("constructor gets called for intialising the data member in custom init method");

    }

    public String getDataMembers(){
        return message+"\t"+name;
    }

    public void customInit(){
        name = name.toUpperCase();
        System.out.println("custom init() gets called");
    }
}
