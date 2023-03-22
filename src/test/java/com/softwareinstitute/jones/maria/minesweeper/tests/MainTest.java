package com.softwareinstitute.jones.maria.minesweeper.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.softwareinstitute.jones.maria.minesweeper.Main.*;

public class MainTest {

    @Test
    public void hello_world_test() {
        assertEquals("Hello minesweeper!", helloMinesweeper(), "Message not returned");
    }
}
