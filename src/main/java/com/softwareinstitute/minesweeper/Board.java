package com.softwareinstitute.minesweeper;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    /////////////////////Attributes/////////////////////
    int length = 10;
    int width = 10;
    private String[][] board = new String[length][width];
    int numOfMines = 10;
    List<Point> mines = new ArrayList<>();


    ////////////////////Constructors////////////////////
    public Board() {
        for (int i = 0; i < width; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print("○ ");
            }
            System.out.println();
        }
    }

    //////////////////////Methods//////////////////////
    public List placeMines(int numOfMines, int width, int length) {
        Random random = new Random();
        int placedMines = 0;
        while (placedMines < numOfMines) {
            int i = random.nextInt(width);
            int j = random.nextInt(length);
            Point mine = new Point(i, j);
            if (!mines.contains(mine)) {
                mines.add(new Point(i, j));
                placedMines++;
            }
        }
        return mines;
    }

    public void printUpdatedBoard(List clicks, List flags, List mines) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                Point square = new Point(i, j);
                if (clicks.contains(square) && mines.contains(square)) {
                    System.out.print("✹ ");
                } else if (clicks.contains(square)) {
                    System.out.print("□ ");
                } else if (flags.contains(square)) {
                    System.out.print("⛝ ");
                } else {
                    System.out.print("○ ");
                }
            }
            System.out.println();
        }
    }
}
