package org.ies.examples;
import org.example.exception.MemberNotFoundException;
import org.example.model.Book;
import org.example.model.Library;
import org.example.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CompanyTest {

    @Test
    public void findUserException() throws MemberNotFoundException {

    }

    private Library createTestlibrary() {

        return new Library(
                "Biblioteca de Leganes",
                Map.of(
                        "1",
                        new Book(
                                "1",
                                "Los juegos del hambre",
                                "Marcos Llorente",
                                (List<String>) Set.of("Novela")
                        ),
                        "2",
                        new Book("2",
                                "El principito",
                                "Juanjo",
                                (List<String>) Set.of("Drma"))
                ),
                Map.of(
                        "5",
                        new User()
                ),
        );


    }
}
