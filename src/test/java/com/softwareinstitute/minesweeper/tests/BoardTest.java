package com.softwareinstitute.minesweeper.tests;

import com.softwareinstitute.minesweeper.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    public void test_num_of_mines() {
        Board testBoard = new Board();
        assertEquals(10, testBoard.placeMines(10, 10, 10).size(), "Number of placed mines is incorrect");
    }


}
