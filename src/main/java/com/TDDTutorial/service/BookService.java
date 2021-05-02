package com.TDDTutorial.service;

import com.TDDTutorial.repository.BookRepository;
import com.TDDTutorial.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookService {

    // Instance variables
    @Autowired
    private BookRepository bookRepository;
    private ArrayList<Book> booksList;

    /**
     * Constructor for BookService instance.
     */
    public BookService() {
        booksList = new ArrayList<>();
    }

    /**
     * Getter for booksList.
     * @return Iterable<Book> of books
     **/
    public Iterable<Book> getAllBooks() {
        return booksList;
    }

    /**
     * Getter for book by id.
     * @param id int value
     * @return Book object that matches id
     */
    public Book getBookById(int id) {
        Book match = null;
        for (Book book: booksList) {
            if (book.getId() == id) {
                match = book;
            }
        }
        return match;
    }

    /**
     * Save a book to booksList.
     * @param book of type Book
     * @return String 'Successful Save'
     **/
    public String saveBook(Book book) {
        booksList.add(book);
        return "Successful Save";
    }

    /**
     * Delete a book from booksList.
     * @param id int value
     * @return String 'Successful Delete'
     **/
    public String deleteBook(int id) {
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getId() == id) {
                booksList.remove(i);
            }
        }
        return "Successful Delete";
    }

}
