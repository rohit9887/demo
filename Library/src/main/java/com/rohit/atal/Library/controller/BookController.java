package com.rohit.atal.Library.controller;

import com.rohit.atal.Library.Model.Book;
import com.rohit.atal.Library.service.BookService;
import com.rohit.atal.Library.service.NotAvailableException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/books")
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable String id) {
        return bookService.getBookById(Integer.parseInt(id));
    }

    @PostMapping(consumes = "application/json")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @DeleteMapping("/{Bookid}")
    public void deleteBook(@PathVariable String Bookid){
        bookService.deletebook(Integer.parseInt(Bookid));
    }
    @PutMapping(path = "/{Bookid}", consumes = "application/json")
    public void updatebook(@PathVariable String Bookid, @RequestBody Book updatedBook) {
        try {
            bookService.updatebook(Integer.parseInt(Bookid), updatedBook);
        } catch (Exception e) {
            System.out.println("Book not found. " + e);
        }
    }
}
