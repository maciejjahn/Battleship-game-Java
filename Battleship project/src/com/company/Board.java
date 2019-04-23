package com.company;

public class Board {
    public static boolean showShips = true;
    public static void boardCreator(String[][] board) {
        for (int v = 0; v < board.length; v++) {
            for (int c = 0; c < board[0].length; c++) {
                board[v][c] = "~";
            }
        }
    }

    public static void drawBoard(String[][] board) {
        System.out.println("______________________");
        System.out.print("  ");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i+1 + " ");
        }
        System.out.println("");
        for (int v = 0; v < board.length; v++) {
            System.out.print((char)(v+65));
            if (showShips == true) {
                for (int c = 0; c < board[0].length; c++) {
                    System.out.print(" " + board[v][c]);
                }
                System.out.println("");
            } else {
                for (int c = 0; c < board[0].length; c++) {
                    if (board[v][c].equals("S")) {
                        System.out.print(" " + "~");
                    } else {
                        System.out.print(" " + board[v][c]);
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("______________________");
    }




}
