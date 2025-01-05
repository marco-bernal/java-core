package com.mab.core.bootcamp.arrays;

import java.util.Scanner;

public class TicTacToe {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Implementation of the famous TicTacToe game.
     * @param args no args passed.
     */
    public static void main(String[] args) {

        System.out.print("Let's play tic tac toe!");

        char[][] board = setUpBoard();
        printBoard(board);
        setUpTurns(board);
    }


    private static char[][] setUpBoard() {
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '_';
            }
        }

        return board;
    }

    private static void printBoard(char[][] board) {

        System.out.println("\n");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    private static void setUpTurns(char[][] board) {
        int[] turns = new int[9];

        for (int i = 0; i < turns.length; i++) {
            System.out.println("\n");

            if (i % 2 == 0) { // X
                System.out.println("Turn: X");
                int[] spot = chooseSpot(board);
                setUpSpot(board, spot, 'X');

            } else {  // O
                System.out.println("Turn: O");
                int[] spot = chooseSpot(board);
                setUpSpot(board, spot, 'O');
            }

            printBoard(board);

            //Starts checking if a user won. After the 5th turn.
            if (i >= 4) {
                int result = checkWin(board);

                if (result == 3) {
                    System.out.println("X wins!");
                    break;
                }

                if (result == -3) {
                    System.out.println("O wins!");
                    break;
                }
            }
        }
    }

    private static int[] chooseSpot(char[][] board) {
        int i;
        int j;

        System.out.println("Pick a row and column number:");

        while(true) {
            i = scanner.nextInt();
            j = scanner.nextInt();

            if (board[i][j] != '_') {
                System.out.println("The chosen spot is already taken. Please choose another one!");
            }
            else {
                break;
            }
        }

        int[] turn = new int[2];
        turn[0] = i;
        turn[1] = j;

        return turn;
    }

    private static void setUpSpot(char[][] board, int[] spot, char user) {
        board[spot[0]][spot[1]] = user;
    }

    private static int checkWin(char[][] board) {
        int rows = checkRows(board);
        if (rows == 3 || rows == -3) {
            return rows;
        }

        int cols = checkCols(board);
        if (cols == 3 || cols == -3) {
            return cols;
        }

        int left = checkLeftDiagonal(board);
        if (left == 3 || left == -3) {
            return left;
        }

        int right = checkRightDiagonal(board);
        if (right == 3 || right == -3) {
            return right;
        }

        return -1;
    }

    private static int checkRows(char[][] board) {
        int count = 0;

        //Checks through every row and adds 1 if X or -1 if O
        for (int i=0; i < board.length; i++) {
            for (int j=0; j < board.length; j++) {
                if (board[i][j] == 'X') {
                    count++;

                    if (count == 3) {
                        return count;
                    }
                }

                if (board[i][j] == 'O') {
                    count--;

                    if (count == -3) {
                        return count;
                    }
                }
            }
            //restart count
            count = 0;
        }

        return count;
    }

    private static int checkCols(char[][] board) {
        int count = 0;

        //Checks through every col and adds 1 if X or -1 if O
        for (int i=0; i < board.length; i++) {
            for (int j=0; j < board.length; j++) {
                if (board[j][i] == 'X') {
                    count++;

                    if (count == 3) {
                        return count;
                    }
                }

                if (board[j][i] == 'O') {
                    count--;

                    if (count == -3) {
                        return count;
                    }
                }
            }
            //restart count
            count = 0;
        }

        return -1;
    }

    private static int checkLeftDiagonal(char[][] board) {
        int count = 0;

        for (int i=0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                count++;
            }

            if (board[i][i] == 'O') {
                count--;
            }
        }

        return count;
    }

    private static int checkRightDiagonal(char[][] board) {
        int count = 0;

        for (int i=0; i < board.length; i++) {
            if (board[i][2 - i] == 'X') {
                count++;
            }

            if (board[i][2 - i] == 'O') {
                count--;
            }
        }

        return count;
    }
}
