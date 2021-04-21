package com.TDDTutorial.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Book {
    // Instance variables
    private int id;
    private String title, author, genre, publisher;

    public Book() {
        id = 0;
        title = "";
        author = "";
        genre = "";
        publisher = "";
    }
}
