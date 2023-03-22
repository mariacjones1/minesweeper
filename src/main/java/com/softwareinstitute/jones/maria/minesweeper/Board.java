package com.softwareinstitute.jones.maria.minesweeper;


public class Board {
    /////////////////////Attributes/////////////////////
    int length = 10;
    int width = 10;
    private String[][] board = new String[length][width];

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


}
