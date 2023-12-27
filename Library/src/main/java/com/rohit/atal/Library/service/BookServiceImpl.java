package com.rohit.atal.Library.service;

import com.rohit.atal.Library.Model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{
    List<Book> BookCollection = new ArrayList<Book>();

    public BookServiceImpl(List<Book> bookCollection) {
        BookCollection = bookCollection;
        bookCollection.add(new Book(12,"dsa","rohit",true));
        bookCollection.add(new Book(13,"maths","atal",true));
    }

    @Override
    public List<Book> getAllBooks() {
        return BookCollection;
    }

    @Override
    public Optional<Book> getBookById(int Bookid) {
        Optional<Book> result = Optional.empty();
        for (Book obj : BookCollection) {
            if (obj.getBookid() == Bookid) {
                result = Optional.of(obj);
                break;
            }
        }
        return result;
    }

    @Override
    public Book addBook(Book book) {
        BookCollection.add(book);
        return book;
    }

    @Override
    public void deletebook(int Bookid) {
        BookCollection.removeIf(obj -> obj.getBookid() == Bookid);
    }

    @Override
    public void updatebook(int Bookid, Book updatedbook)  {
        try {
            for (Book obj : BookCollection) {
                if (obj.getBookid() == Bookid) {
                    obj.setBookName(updatedbook.getBookName());
                    obj.setAuthor(updatedbook.getAuthor());
                    break;
                }
            }
        }
        catch (Exception ignored) {
        }
    }
}
