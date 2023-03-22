package com.softwareinstitute.minesweeper;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.placeMines(10, 10, 10));
        Scanner chooseCol = new Scanner(System.in);
        Scanner chooseRow = new Scanner(System.in);
        Scanner chooseClick = new Scanner(System.in);

        List<Point> clicks = new ArrayList<>();
        List<Point> flags = new ArrayList<>();

        System.out.println("Choose a column 0-" + (board.width - 1));
        int col = chooseCol.nextInt();
        System.out.println("Choose a row 0-" + (board.length - 1));
        int row = chooseRow.nextInt();
        System.out.println("Do you want to click (C) or place a flag (F)?");
        String click = chooseClick.nextLine().toUpperCase();
        if (click.equals("C")) {
            clicks.add(new Point(col, row));
        } else if (click.equals("F")) {
            flags.add(new Point(col, row));
        } else {
            System.out.println("Invalid choice.");
        }
        System.out.println(clicks);
        System.out.println(flags);
    }


}