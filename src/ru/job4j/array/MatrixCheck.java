package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rsl = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(char[][] board, int cell) {
        boolean rsl = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][cell] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
