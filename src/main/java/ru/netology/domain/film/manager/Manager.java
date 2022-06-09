package ru.netology.domain.film.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.netology.domain.film.Film;


@AllArgsConstructor
@Data


public class Manager {
    private Film[] films = new Film[0];

    public Manager(int recentMovies) {
        this.recentMovies = recentMovies;
    }

    public Manager() {

    }

    int recentMovies = 10;


    public Film[] add(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
        return films;
    }

    public Film[] findAll() {
        if (films.length == 0) {
            return null;
        }
        return films;
    }


    public Film[] findLast() {
        Film[] films1 = findAll();
        if (films1.length < recentMovies) {
            Film[] tmp = new Film[films1.length];
            System.arraycopy(films1, 0, tmp, 0, films1.length);
            Film[] result = new Film[tmp.length];
            for (int i = 0; i < result.length; i++) {
                int index = tmp.length - i - 1;
                result[i] = tmp[index];
            }
            return result;

        }
        Film[] tmp = new Film[recentMovies];
        System.arraycopy(films1, films1.length - recentMovies, tmp, 0, recentMovies);
        Film[] result = new Film[tmp.length];
        for (int i = 0; i < result.length; i++) {
            int index = tmp.length - i - 1;
            result[i] = tmp[index];

        }
        return result;
    }

}
