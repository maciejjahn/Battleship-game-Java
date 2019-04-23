package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


import static com.company.Board.boardCreator;


public class Main {

    public static int shoot(String[][] board, int hits, int bullets) {
        Scanner bulletScanner = new Scanner(System.in);
        int v;//row
        int c;//column
        System.out.println("Number of bullets " + bullets);
        System.out.println("Select row from A to J");
        v = (int)(bulletScanner.next().charAt(0)) - 64;
        while (v> 10 || v < 1) {
            System.out.println("Please select your row only from A to J");
            v = bulletScanner.next().charAt(0) - 64;
        }
        System.out.println("Select column from 1 to 10");
        c = bulletScanner.nextInt();
        while (c > 10 || c < 1) {
            System.out.println("Please select your column only from 1 to 10");
            c = bulletScanner.nextInt();
        }
        if (board[v - 1][c - 1].equals("S")) {
            hits++;
            System.out.println("HIT!");
            board[v - 1][c - 1] = "O";
        } else {
            System.out.println("YOU MISSED!");
            board[v - 1][c - 1] = "X";
        }
        return hits;
    }

    public static void ending(int hits, int bullets) {
        if (hits < 20)
            System.out.println("You didn't destroyed all ships!");
        if (bullets < 1)
            System.out.println("You ran out of bullets!");
        else if (hits == 20) {
            System.out.println("Congratulations! You win!");
        }
    }

    public static void run() throws FileNotFoundException {
        File logpasswd = new File("logpasswd.txt");

        Scanner scan = new Scanner (logpasswd);
        Scanner keyboard = new Scanner (System.in);
        String user = scan.nextLine();
        String pass = scan.nextLine();

        System.out.println("Enter your username");
        String inpUser = keyboard.nextLine();
        System.out.println("Enter your password");
        String inpPass = keyboard.nextLine();

        if (inpUser.equals(user) && inpPass.equals(pass)) {
            System.out.print("You have been successfully logged in!\n");
        } else {
            System.out.print("Incorrect login or password!");
            System.exit(0);
        }

    }


    public static void main(String[] arg) {

        try {
            run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[][] board = new String[10][10];
        boardCreator(board);
        while(true)
        {
            Scanner menuScanner = new Scanner(System.in);

            System.out.println("Choose option:\n");
            System.out.println("To play against yourself press 1\n");
            System.out.println("To exit game press other key\n");

            int change=0;
            change = menuScanner.nextInt();
            switch(change)
            {
                case 1:
                {
                    Ship.shipCreator(board);
                    Board.drawBoard(board);
                    break;
                }

                default:
                {
                    System.out.println("Incorrect command.");
                    System.exit(0);
                    break;
                }
            }
           if (change == 1)

                break;
        }

        int bullets = 3;
        int hits = 0;

        while (bullets > 0 && hits < 20) {
            hits = shoot(board, hits, bullets);
            bullets--;
        }
        ending(hits, bullets);




    }
}