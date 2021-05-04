package com.TDDTutorial.service;

import com.TDDTutorial.repository.BookRepository;
import com.TDDTutorial.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    // Instance variables
    @Autowired
    private BookRepository bookRepository;

    /**
     * Getter for booksList.
     * @return Iterable<Book> of books
     **/
    public Iterable<Book> getAllBooks() {
        List<Book> books = new ArrayList<Book>();
        bookRepository.findAll().forEach(book -> books.add(book));
        return books;
    }

    /**
     * Getter for book by id.
     * @param id int value
     * @return Book object that matches id
     */
    public Book getBookById(int id) {
        return bookRepository.findById(id).get();
    }

    /**
     * Save a book to booksList.
     * @param book of type Book
     * @return String 'Successful Save'
     **/
    public String saveBook(Book book) {
        bookRepository.save(book);
        return "Successful Save";
    }

    /**
     * Delete a book from booksList.
     * @param id int value
     * @return String 'Successful Delete'
     **/
    public String deleteBook(int id) {
        bookRepository.deleteById(id);
        return "Successful Delete";
    }

}
