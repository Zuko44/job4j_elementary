package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int elem = 0; elem < board[row].length; elem++) {
            if (board[row][elem] != 'X' && board[row][elem] == ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (int elem = 0; elem < board.length; elem++) {
            if (board[elem][column] != 'X' && board[elem][column] == ' ') {
                return false;
            }
        }
        return true;
    }
}
