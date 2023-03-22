package com.softwareinstitute.jones.maria.minesweeper;


import java.util.ArrayList;
import java.util.List;

public class Board {
    /////////////////////Attributes/////////////////////
    int length = 10;
    int width = 10;
    private String[][] board = new String[length][width];
    int numberOfMines;
    public List<String> mines = new ArrayList<>();


    ////////////////////Constructors////////////////////
    public Board() {
        for (int i = 0; i < length; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }

    //////////////////////Methods//////////////////////
    public List setMines() {
        if (length * width <= 100) {
            numberOfMines = 10;
        } else if (length * width <= 256) {
            numberOfMines = 40;
        } else {
            numberOfMines = 99;
        }

        String minePosition;
        for (int mineNum = 0; mineNum < numberOfMines; mineNum++) {
            int row = (int) Math.floor(Math.random() * width);
            int col = (int) Math.floor(Math.random() * length);
            minePosition = "(" + row + ", " + col + ")";
            mines.add(minePosition);
        }
        return mines;
    }

}
