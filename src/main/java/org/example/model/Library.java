package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import org.example.exception.BookNotFoundException;
import org.example.exception.MemberNotFoundException;

import java.util.List;
import java.util.Map;

@Data
@Log4j
@AllArgsConstructor
public class Library {

    private String name;
    private Map<String, Book> booksByIsbn;
    private Map<String, User> usersByNif;
    private List<Loan> loans;

    public void showUsers() {
        for (var user : usersByNif.values()) {
            log.info(user.toString());
        }
    }

    public void showBooks() {
        for (var book : booksByIsbn.values()) {
            log.info(book.toString());
        }
    }

    public Book showBooksException(String isbn) throws BookNotFoundException {
        if (!booksByIsbn.containsKey(isbn)) {
            throw new BookNotFoundException(isbn);
        }
        return booksByIsbn.get(isbn);
    }

    public User showUsersException(String nif) throws MemberNotFoundException {
        if (!usersByNif.containsKey(nif)) {
            throw new MemberNotFoundException(nif);
        }
        return usersByNif.get(nif);
    }

    public boolean UserBooks(String nif, String isbn) throws MemberNotFoundException, BookNotFoundException {

        if (booksByIsbn.containsKey(isbn)) {
            if (usersByNif.containsKey(nif)){
                return true;
            }else {
                throw new MemberNotFoundException(nif);
            }
        }else {
            throw new BookNotFoundException(isbn);
        }
    }
}