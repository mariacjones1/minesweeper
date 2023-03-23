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
        System.out.println("0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < width; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print("□ ");
            }
            System.out.print(i);
            System.out.println();
        }
    }

    //////////////////////Methods//////////////////////
    public List placeMines(int numOfMines, int length, int width) {
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
        System.out.println("0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                Point square = new Point(i, j);
                List<Point> neighbours = new ArrayList<>();
                Point n1 = new Point(i-1, j-1);
                if (mines.contains(n1)) {
                    neighbours.add(n1);
                }
                Point n2 = new Point(i, j-1);
                if (mines.contains(n2)) {
                    neighbours.add(n2);
                }
                Point n3 = new Point(i+1, j-1);
                if (mines.contains(n3)) {
                    neighbours.add(n3);
                }
                Point n4 = new Point(i+1, j);
                if (mines.contains(n4)) {
                    neighbours.add(n4);
                }
                Point n5 = new Point(i+1, j+1);
                if (mines.contains(n5)) {
                    neighbours.add(n5);
                }
                Point n6 = new Point(i, j+1);
                if (mines.contains(n6)) {
                    neighbours.add(n6);
                }
                Point n7 = new Point(i-1, j+1);
                if (mines.contains(n7)) {
                    neighbours.add(n7);
                }
                Point n8 = new Point(i-1, j);
                if (mines.contains(n8)) {
                    neighbours.add(n8);
                }
                if (clicks.contains(square) && mines.contains(square)) {
                    System.out.print("✹ ");
                } else if (clicks.contains(square)) {
                    if (neighbours.size() == 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print(neighbours.size() + " ");
                    }
                } else if (flags.contains(square)) {
                    System.out.print("■ ");
                } else {
                    System.out.print("□ ");
                }
            }
            System.out.print(i);
            System.out.println();
        }
    }
}
