package ru.netology.domain.film.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.film.Film;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {


    Film first = new Film(1, "Iron man", 200);
    Film second = new Film(2, "Iron man 2", 350);
    Film third = new Film(3, "Iron man 3", 450);
    Film fourth = new Film(4, "Tor ", 250);
    Film fifth = new Film(5, "Tor 2 ", 200);
    Film sixth = new Film(6, "Tor 3 ", 500);
    Film seventh = new Film(7, " spider man ", 450);
    Film eighth = new Film(8, " spider man 2 ", 500);
    Film ninth = new Film(9, " spider man 3 ", 200);
    Film tenth = new Film(10, "Dr. Strange", 550);
    Film eleventh = new Film(11, "Dr. Strange 2", 700);
    Film twelfth = new Film(12, "Dr. Strange 3", 300);


    @Test
    public void shouldAddNewFilm() {
        Manager manager = new Manager();

        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        Film[] expected = new Film[]{second, third, fourth, first};
        Film[] actual = manager.add(first);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilms() {
        Manager manager = new Manager();

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);


        Film[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth};
        Film[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFilms() {
        Manager manager = new Manager();

        Film[] expected = null;
        Film[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLatestElevenFilms() {
        Manager manager = new Manager(9);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        Film[] expected = new Film[]{twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth};
        Film[] actual = manager.findLast();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldFindLatestEightFilms() {
        Manager manager = new Manager(10);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);


        Film[] expected = new Film[]{eighth, seventh, sixth, fifth, fourth, third, second, first};
        Film[] actual = manager.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAllFilms() {
        Manager manager = new Manager(12);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);


        Film[] expected = new Film[]{twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Film[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }


}


//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//        manager.add(fourth);
//        manager.add(fifth);
//        manager.add(sixth);
//        manager.add(seventh);
//        manager.add(eighth);
//        manager.add(ninth);
//        manager.add(tenth);
//        manager.add(eleventh);
//        manager.add(twelfth);
//
//



