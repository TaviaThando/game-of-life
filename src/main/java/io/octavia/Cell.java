package io.octavia;

public class Cell {
    private final boolean isAlive;
    private final int positionX;
    private final int positionY;
    private final int cellWidth = 20;
    private final int cellHeight = 20;

    public Cell(boolean isAlive, int positionX, int positionY) {
        this.isAlive = isAlive;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getCellWidth() {
        return cellWidth;
    }

    public int getCellHeight() {
        return cellHeight;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}
