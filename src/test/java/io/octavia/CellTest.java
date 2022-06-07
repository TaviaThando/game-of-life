package io.octavia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellTest {
    Cell cell = new Cell(true, 0, 0);

    @Test
    public void isAlive() {
        assertTrue(cell.isAlive());
    }

    @Test
    public void getCellWidth() {
        assertEquals(20, cell.getCellWidth());
    }

    @Test
    public void getCellHeight() {
        assertEquals(20, cell.getCellHeight());
    }

    @Test
    public void getPositionX() {
        assertEquals(0, cell.getPositionX());
    }

    @Test
    public void getPositionY() {
        assertEquals(0, cell.getPositionY());
    }
}