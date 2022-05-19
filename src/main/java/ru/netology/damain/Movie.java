package ru.netology.damain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Movie {
    private int id;
    private String genre;
    private String name;
    private boolean premier;
}

