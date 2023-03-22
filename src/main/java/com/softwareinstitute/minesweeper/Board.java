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
    int numberOfMines;
    public List<String> mines = new ArrayList<>();


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
        List<Point> mines = new ArrayList<>();
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
}
