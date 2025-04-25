package org.example.exception;


public class MemberNotFoundException extends Exception{

    public MemberNotFoundException(String nif) {
        super("Socio no encontrado: " + nif);
    }
}
