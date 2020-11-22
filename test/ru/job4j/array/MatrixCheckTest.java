package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void monoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', '@'},
        };
        assertTrue((MatrixCheck.monoHorizontal(input, 1)));
        }

    @Test
    public void monoVertical() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'X', '@'},
                {' ', 'X', ' '},
        };
        assertTrue((MatrixCheck.monoVertical(input, 1)));
    }
}
