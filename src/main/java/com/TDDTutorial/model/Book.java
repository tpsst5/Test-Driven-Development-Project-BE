package com.TDDTutorial.model;

import lombok.Data;

import javax.persistence.Entity;

/**
 * Internship Pre-work - Book.java
 * @author Tim Shea
 * @version 4/21/21
 * Creates book objects with various methods and variables related to books.
 **/
@Data
@Entity
public class Book {
    // Instance variables
    private int id;
    private String title, author, genre, publisher;

    /**
     * Create instance of Book object.
     **/
    public Book() {
        id = 0;
        title = "";
        author = "";
        genre = "";
        publisher = "";
    }

    /**
     * Setter for id.
     * @param idInput of Book
     **/
    public void setId(int idInput) {
        id = idInput;
    }

    /**
     * Getter for id.
     * @return int of id
     **/
    public int getId() {
        return id;
    }

    /**
     * Setter for title.
     * @param title of Book
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for title.
     * @return String of title
     **/
    public String getTitle() {
        return title;
    }

    /**
     * Setter for author.
     * @param author of Book
     **/
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Getter for author.
     * @return String of author
     **/
    public String getAuthor() {
        return author;
    }

    /**
     * Setter for genre.
     * @param genre of Book
     **/
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Getter for genre.
     * @return String of genre
     **/
    public String getGenre() {
        return genre;
    }

    /**
     * Setter for publisher.
     * @param publisher of Book
     **/
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Getter for publisher.
     * @return String of publisher
     **/
    public String getPublisher() {
        return publisher;
    }
}
