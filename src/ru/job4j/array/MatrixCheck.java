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
        for (int rowcell = 0; rowcell < board.length; rowcell++) {
            rsl[rowcell] = board[rowcell][rowcell];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int rowcell = 0; rowcell < board.length; rowcell++) {
            if (board[rowcell][rowcell] == 'X') {
                if (((monoVertical(board, rowcell))) || ((monoHorizontal(board, rowcell)))) {
                result = true;
                break;
                }
            }
        }
        return result;
    }
}


