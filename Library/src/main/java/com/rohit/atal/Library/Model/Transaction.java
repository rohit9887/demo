package com.rohit.atal.Library.Model;

import java.time.LocalDate;

public class Transaction {
    private Long id;
    private Book book;
    private User user;

    private LocalDate borrowdate;
    private LocalDate returndate;

    public Transaction(Long id, Book book, User user, LocalDate borrowdate, LocalDate returndate) {
        this.id = id;
        this.book = book;
        this.user = user;
        this.borrowdate = borrowdate;
        this.returndate = returndate;
    }

    public Transaction() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getBorrowdate() {
        return borrowdate;
    }

    public void setBorrowdate(LocalDate borrowdate) {
        this.borrowdate = borrowdate;
    }

    public LocalDate getReturndate() {
        return returndate;
    }

    public void setReturndate(LocalDate returndate) {
        this.returndate = returndate;
    }
}
