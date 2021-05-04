package com.TDDTutorial.controller;

import com.TDDTutorial.model.Book;
import com.TDDTutorial.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    private Iterable<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    private Book getBookById(@PathVariable("id") int id) {
        return bookService.getBookById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    private String createBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    private String updateBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    private String deleteBook(@PathVariable("id") int id) {
        return bookService.deleteBook(id);
    }
}
