package ru.netology.domain.film;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Film {
    private int id;
    private String name;
    private int cost;

    public Film(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
