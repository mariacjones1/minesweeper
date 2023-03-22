package com.softwareinstitute.jones.maria.minesweeper.tests;

import org.junit.jupiter.api.Test;
import com.softwareinstitute.jones.maria.minesweeper.Board;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    public void set_mines_test() {
        Board testBoard = new Board();
        testBoard.setMines();
        assertTrue(testBoard.mines.size()==10);
    }


}
