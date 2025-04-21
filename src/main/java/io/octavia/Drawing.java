package io.octavia;

public class Drawing {
    static void drawBoundaries(Turtle turtle, Grid grid, Cell cell) {
        turtle.up();
        turtle.goTo(grid.getMinX(), grid.getMinY());
        turtle.down();

        for (int i = 0; i < 4; i++) {
            turtle.forward(500);
            turtle.left(90);
        }

        drawAllCells(turtle, grid);
    }

    static void drawAllCells(Turtle turtle, Grid grid) {
        turtle.speed(10);
        Cell[][] cells = grid.getCells();

        int minX = grid.getMinX();
        int minY = grid.getMinY();
        int maxX = grid.getMaxX();
        int maxY = grid.getMaxY();

        for (Cell[] row : cells) {
            for (Cell cell : row) {
                // Calculate the cell's position in the grid
                double x = minX + cell.getX() * 20; // Adjust cell size as needed
                double y = minY + cell.getY() * 20;

                // Only draw the cell if it is within the boundaries
                if (x >= minX && x <= maxX && y >= minY && y <= maxY) {
                    cell.setAlive(Math.random() < 0.5); // Randomly set cell state for demonstration
                    if (cell.isAlive()) {
                        turtle.setColor("pink");

                        // Draw a filled rectangle for the alive cell
                        turtle.up();
                        turtle.goTo(x, y);
                        turtle.down();

                        for (int i = 0; i < 4; i++) {
                            turtle.forward(20); // Cell width
                            turtle.left(90);
                        }
                    } else {
                        turtle.setColor("black");

                        // Draw a filled rectangle for the dead cell
                        turtle.up();
                        turtle.goTo(x, y);
                        turtle.down();

                        for (int i = 0; i < 4; i++) {
                            turtle.forward(20); // Cell width
                            turtle.left(90);
                        }
                    }
                }
            }
        }
    }
}
