package org.example.exception;


public class BookNotFoundException extends Exception{

    public BookNotFoundException(String isbn) {
        super("Libro no encontrado: " + isbn);
    }
}
