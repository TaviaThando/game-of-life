package io.octavia;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    private final int minX = -250;
    private final int minY = -250;
    private final int maxX = 250;
    private final int maxY = 250;
    private final int rows = 25;
    private final int cols = 25;
    private final Cell[][] cells = new Cell[rows][cols];

    public Grid() {
        // Initialize the grid with random states
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell(Math.random() < 0.5, i, j);
            }
        }
    }

    public int getMinX() {
        return minX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public List<Cell> getNeighbors(Cell cell) {
        List<Cell> neighbors = new ArrayList<>();
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int nx = cell.getX() + dx[i];
            int ny = cell.getY() + dy[i];
            if (nx >= 0 && nx < rows && ny >= 0 && ny < cols) {
                neighbors.add(cells[nx][ny]);
            }
        }
        return neighbors;
    }

    public void updateGrid() {
        Cell[][] nextState = new Cell[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Cell cell = cells[i][j];
                List<Cell> neighbors = getNeighbors(cell);
                long aliveNeighbors = neighbors.stream().filter(Cell::isAlive).count();

                boolean nextAlive = cell.isAlive()
                        ? aliveNeighbors == 2 || aliveNeighbors == 3
                        : aliveNeighbors == 3;

                nextState[i][j] = new Cell(nextAlive, i, j);
            }
        }

        // Update the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = nextState[i][j];
            }
        }
    }
}
