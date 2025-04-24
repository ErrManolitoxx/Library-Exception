package org.example.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String nif;
    private String name;
    private String surname;
    private int subNum;
    private int zipCode;

}
