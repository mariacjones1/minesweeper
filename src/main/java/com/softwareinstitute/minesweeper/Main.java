package com.softwareinstitute.minesweeper;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        List<Point> mines = board.placeMines(10, 10, 10);
        System.out.println(mines);
        Scanner chooseCol = new Scanner(System.in);
        Scanner chooseRow = new Scanner(System.in);
        Scanner chooseClick = new Scanner(System.in);

        List<Point> clicks = new ArrayList<>();
        List<Point> flags = new ArrayList<>();

        Boolean runGame = true;
        Boolean winner = null;

        while (runGame) {
            System.out.println("Choose a column 0-" + (board.width - 1));
            int col = chooseCol.nextInt();
            System.out.println("Choose a row 0-" + (board.length - 1));
            int row = chooseRow.nextInt();
            System.out.println("Do you want to click (C) or place a flag (F)?");
            String click = chooseClick.nextLine().toUpperCase();
            Point selection = new Point(row, col);
            if (click.equals("C")) {
                clicks.add(selection);
                if (mines.contains(selection)) {
                    runGame = false;
                    winner = false;
                }
            } else if (click.equals("F")) {
                flags.add(selection);
            } else {
                System.out.println("Invalid choice.");
            }
            System.out.println(clicks);
            System.out.println(flags);

            board.printUpdatedBoard(clicks, flags, mines);
            if (clicks.size() == (board.length * board.width - mines.size())) {
                runGame = false;
                winner = true;
                break;
            }
        }

        if (winner == true) {
            System.out.println("You win!");
        } else {
            System.out.println("Game over!");
        }
    }


}