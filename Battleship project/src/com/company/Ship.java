package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Ship {
    public static void shipCreator(String[][] board) {


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) { //one-masted ship
            System.out.println("One-masted ship number " + (i + 1));
            System.out.println("Where do you want to start?");
            System.out.println("Select row from A to J");


           int v = (int)(scanner.next().charAt(0)) - 64;//row
            while (v > 10 || v < 1) {
                System.out.println("Please select your row only from A to J");
                v = scanner.next().charAt(0) - 64;
            }
            System.out.println("Select column from 1 to 10");
           int c  = scanner.nextInt();//column
            while (c > 10 || c < 1) {
                System.out.println("Please select your column only from 1 to 10");
                c = scanner.nextInt();
            }
            if (Objects.equals(board[v - 1][c - 1], "S")) {
                System.out.println("This place is already occupied");
                i--;
            } else {
                board[v - 1][c - 1] = "S";
            }
        }

        for (int i = 0; i < 3; i++) { //Two-masted ships
            boolean isOccupied = false;
            System.out.println("Two-masted ship number " + (i + 1));
            System.out.println("Where do you want to start?");
            System.out.println("Straight Down(0), Straight Up(1), Horizontally to the right(2), Horizontally to the left(3)");
            int direction = scanner.nextInt();
            if (direction == 0) {
                System.out.println("Select row from A to J");
                int v = (int)(scanner.next().charAt(0)) - 64;
                while (v > 10 || v < 1) {
                    System.out.println("Please select your row only from A to J");
                    v = scanner.next().charAt(0) - 64;
                }
                System.out.println("Select column from 1 to 10");
                int c = scanner.nextInt();
                while (c > 10 || c < 1) {
                    System.out.println("Od 1 do 10...!");
                    c = scanner.nextInt();
                }
                for (int j = 0; j < 2; j++) {
                    if (Objects.equals(board[v + j - 1][c - 1], "S")) {
                        System.out.println("This place is already occupied");
                        i--;
                        isOccupied = true;
                        break;
                    }
                }
                if (!isOccupied) {
                    for (int j = 0; j < 2; j++) {
                        board[v + j - 1][c - 1] = "S";
                    }
                }
            }
            else if (direction==1){
                System.out.println("Select row from A to J");
                int v = (int)(scanner.next().charAt(0)) - 64;
                while (v >10 || v < 1) {
                    System.out.println("Please select your row only from A to J");
                    v = scanner.next().charAt(0) - 64;
                }
                System.out.println("Select column from 1 to 10");
                int c = scanner.nextInt();
                while (c > 10 || c < 1) {
                    System.out.println("Od 1 do 10...!");
                    c = scanner.nextInt();
                }
                for (int j = 0; j < 2; j++) {
                    if (Objects.equals(board[v - j - 1][c - 1], "S")) {
                        System.out.println("This place is already occupied");
                        i--;
                        isOccupied = true;
                        break;
                    }
                }
                if (!isOccupied) {
                    for (int j = 0; j < 2; j++) {
                        board[v - j - 1][c - 1] = "S";
                    }
                }
            }
            else if(direction==2){
                System.out.println("Select row from A to J");
                int v = (int)(scanner.next().charAt(0)) - 64;
                while (v > 10 || v < 1) {
                    System.out.println("Please select your row only from A to J");
                    v = scanner.next().charAt(0) - 64;
                }
                System.out.println("Select column from 1 to 10");
                int c = scanner.nextInt();
                while (c > 10 || c < 1) {
                    System.out.println("Od 1 do 10...!");
                    c = scanner.nextInt();
                }
                for (int j = 0; j < 2; j++) {
                    if (Objects.equals(board[v - 1][c + j - 1], "S")) {
                        System.out.println("This place is already occupied");
                        i--;
                        isOccupied = true;
                        break;
                    }
                }
                if (!isOccupied) {
                    for (int j = 0; j < 2; j++) {
                        board[v - 1][c + j - 1] = "S";
                    }
                }

            }
            else if (direction == 3) {
                System.out.println("Select row from A to J");
                int v = (int)(scanner.next().charAt(0)) - 64;
                while (v > 10 || v < 1) {
                    System.out.println("Please select your row only from A to J");
                    v = scanner.next().charAt(0) - 64;
                }
                System.out.println("Select column from 1 to 10");
                int c = scanner.nextInt();
                while (c > 10 || c < 1) {
                    System.out.println("Od 1 do 9...!");
                    c = scanner.nextInt();
                }
                for (int j = 0; j < 2; j++) {
                    if (Objects.equals(board[v - 1][c - j - 1], "S")) {
                        System.out.println("This place is already occupied");
                        i--;
                        isOccupied = true;
                        break;
                    }
                }
                if (!isOccupied) {
                    for (int j = 0; j < 2; j++) {
                        board[v - 1][c - j - 1] = "S";
                    }
                }
            } else {
                System.out.println("Wrong number, please select again");
                i--;
            }
        }

        for (int i = 0; i < 2; i++) { //Three-masted ships
            boolean isOccupied = false;
            System.out.println("Three-masted ship number " + (i + 1));
            System.out.println("Straight Down(0), Straight Up(1), Horizontally to the right(2), Horizontally to the left(3)");
            int direction = scanner.nextInt();
            if (direction == 0) {
                System.out.println("Select row from A to J");
                int v = (int)(scanner.next().charAt(0)) - 64;
                while (v > 10 || v < 1) {
                    System.out.println("Please select your row only from A to J");
                    v = scanner.next().charAt(0) - 64;
                }
                System.out.println("Select column from 1 to 10");
                int c = scanner.nextInt();
                while (c > 10 || c < 1) {
                    System.out.println("Od 1 do 10...!");
                    c = scanner.nextInt();
                }
                for (int j = 0; j < 3; j++) {
                    if (Objects.equals(board[v + j - 1][c - 1], "S")) {
                        System.out.println("This place is already occupied");
                        i--;
                        isOccupied = true;
                        break;
                    }
                }
                if (!isOccupied) {
                    for (int j = 0; j < 3; j++) {
                        board[v + j - 1][c - 1] = "S";
                    }
                }
            }
            else if (direction==1){
                System.out.println("Select row from A to J");
                int v = (int)(scanner.next().charAt(0)) - 64;
                while (v > 10 || v < 1) {
                    System.out.println("Please select your row only from A to J");
                    v = scanner.next().charAt(0) - 64;
                }
                System.out.println("Select column from 1 to 10");
                int c = scanner.nextInt();
                while (c > 10 || c < 1) {
                    System.out.println("Od 1 do 10...!");
                    c = scanner.nextInt();
                }
                for (int j = 0; j < 3; j++) {
                    if (Objects.equals(board[v - j - 1][c - 1], "S")) {
                        System.out.println("This place is already occupied");
                        i--;
                        isOccupied = true;
                        break;
                    }
                }
                if (!isOccupied) {
                    for (int j = 0; j < 3; j++) {
                        board[v - j - 1][c - 1] = "S";
                    }
                }
            }


            else if (direction == 2) {
                System.out.println("Select row from A to J");
                int v = (int)(scanner.next().charAt(0)) - 64;
                while (v > 10 || v < 1) {
                    System.out.println("Please select your row only from A to J");
                    v = scanner.next().charAt(0) - 64;
                }
                System.out.println("Select column from 1 to 10");
                int c = scanner.nextInt();
                while (c > 10 || c < 1) {
                    System.out.println("Od 1 do 8...!");
                    c = scanner.nextInt();
                }
                for (int j = 0; j < 3; j++) {
                    if (Objects.equals(board[v - 1][c + j - 1], "S")) {
                        System.out.println("This place is already occupied");
                        i--;
                        isOccupied = true;
                        break;
                    }
                }
                if (!isOccupied) {
                    for (int j = 0; j < 3; j++) {
                        board[v - 1][c + j - 1]= "S";
                    }
                }
            }
            else if(direction==3) {
                System.out.println("Select row from A to J");
                int v = (int)(scanner.next().charAt(0)) - 64;
                while (v > 10 || v < 1) {
                    System.out.println("Please select your row only from A to J");
                    v = scanner.next().charAt(0) - 64;
                }
                System.out.println("Select column from 1 to 10");
                int c = scanner.nextInt();
                while (c > 10 || c < 1) {
                    System.out.println("Od 1 do 8...!");
                    c = scanner.nextInt();
                }
                for (int j = 0; j < 3; j++) {
                    if (Objects.equals(board[v - 1][c - j - 1], "S")) {
                        System.out.println("This place is already occupied");
                        i--;
                        isOccupied = true;
                        break;
                    }
                }
                if (!isOccupied) {
                    for (int j = 0; j < 3; j++) {
                        board[v - 1][c - j - 1]= "S";
                    }
                }
            }
            else {
                System.out.println("Wrong number, please select again");
                i--;
            }
        }

        for (int i = 0; i < 1; i++) { //Four-masted ships
            boolean isOccupied = false;
            System.out.println("Four-masted ship number " + (i + 1));
            System.out.println("Straight Down(0), Straight Up(1), Horizontally to the right(2), Horizontally to the left(3)");
            int direction = scanner.nextInt();
            if (direction == 0) {
                System.out.println("Select row from A to J");
                int v = (int)(scanner.next().charAt(0)) - 64;
                while (v > 10 || v < 1) {
                    System.out.println("Please select your row only from A to J");
                    v = scanner.next().charAt(0) - 64;
                }
                System.out.println("Select column from 1 to 10");
                int c = scanner.nextInt();
                while (c > 10 || c < 1) {
                    System.out.println("Od 1 do 10...!");
                    c = scanner.nextInt();
                }
                for (int j = 0; j < 4; j++) {
                    if (Objects.equals(board[v + j - 1][c - 1], "S")) {
                        System.out.println("This place is already occupied");
                        i--;
                        isOccupied = true;
                        break;
                    }
                }
                if (!isOccupied) {
                    for (int j = 0; j < 4; j++) {
                        board[v + j - 1][c - 1] = "S";
                    }
                }

            }
            else if (direction==1){
                System.out.println("Select row from A to J");
                int v = (int)(scanner.next().charAt(0)) - 64;
                while (v > 10 || v < 1) {
                    System.out.println("Please select your row only from A to J");
                    v = scanner.next().charAt(0) - 64;
                }
                System.out.println("Select column from 1 to 10");
                int c = scanner.nextInt();
                while (c > 10 || c < 1) {
                    System.out.println("Od 1 do 10...!");
                    c = scanner.nextInt();
                }
                for (int j = 0; j < 4; j++) {
                    if (Objects.equals(board[v - j - 1][c - 1], "S")) {
                        System.out.println("This place is already occupied");
                        i--;
                        isOccupied = true;
                        break;
                    }
                }
                if (!isOccupied) {
                    for (int j = 0; j < 4; j++) {
                        board[v - j - 1][c - 1] = "S";
                    }
                }
            }
            else if (direction == 2) {
                System.out.println("Select row from A to J");
                int v = (int)(scanner.next().charAt(0)) - 64;
                while (v > 10 || v < 1) {
                    System.out.println("Please select your row only from A to J");
                    v = scanner.next().charAt(0) - 64;
                }
                System.out.println("Select column from 1 to 10");
                int c = scanner.nextInt();
                while (c > 10 || c < 1) {
                    System.out.println("Od 1 do 7...!");
                     c = scanner.nextInt();
                }
                for (int j = 0; j < 4; j++) {
                    if (Objects.equals(board[v - 1][c + j - 1], "S")) {
                        System.out.println("This place is already occupied");
                        i--;
                        isOccupied = true;
                        break;
                    }
                }
                if (!isOccupied) {
                    for (int j = 0; j < 4; j++) {
                        board[v - 1][c + j - 1] = "S";
                    }
                }
            }
            else if(direction==3){
                System.out.println("Select row from A to J");
                int v = (int)(scanner.next().charAt(0)) - 64;
                while (v > 10 || v < 1) {
                    System.out.println("Please select your row only from A to J");
                    v = scanner.next().charAt(0) - 64;
                }
                System.out.println("Select column from 1 to 10");
                int c = scanner.nextInt();
                while (c > 10 || c < 1) {
                    System.out.println("Od 1 do 10...!");
                    c = scanner.nextInt();
                }
                for (int j = 0; j < 4; j++) {
                    if (Objects.equals(board[v - 1][c - j - 1], "S")) {
                        System.out.println("This place is already occupied");
                        i--;
                        isOccupied = true;
                        break;
                    }
                }
                if (!isOccupied) {
                    for (int j = 0; j < 4; j++) {
                        board[v - 1][c - j - 1] = "S";
                    }
                }
            }
            else {
                System.out.println("Wrong number, please select again");
                i--;
            }
        }
    }
}
