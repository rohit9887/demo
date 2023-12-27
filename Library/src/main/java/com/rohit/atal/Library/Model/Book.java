package com.rohit.atal.Library.Model;

public class Book {
    private int Bookid;
    private String BookName;
    private String Author;
    private boolean available;

    public boolean isAvailable() {
        return available;
    }

    public Book() {
        super();
    }

    public Book(int bookid, String bookName, String author, boolean available) {
        Bookid = bookid;
        BookName = bookName;
        Author = author;
        this.available = available;
    }

    public int getBookid() {
        return Bookid;
    }

    public void setBookid(int bookid) {
        Bookid = bookid;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
