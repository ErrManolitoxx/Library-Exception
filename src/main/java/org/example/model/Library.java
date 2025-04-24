package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.Main;

import java.util.Map;

@Data
@AllArgsConstructor
public class Library {

    private String name;
    private Map<String, Book> booksByIsbn;
    private Map<String, User> usersByNif;

 }
