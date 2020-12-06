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

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int diagonal = 0; diagonal < board.length; diagonal++) {
            rsl[diagonal] = board[diagonal][diagonal];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int diagonal = 0; diagonal < board.length; diagonal++) {
            if (board[diagonal][diagonal] == 'X') {
                if (((monoVertical(board, diagonal))) || ((monoHorizontal(board, diagonal)))) {
                result = true;
                break;
                }
            }
        }
        return result;
    }
}


