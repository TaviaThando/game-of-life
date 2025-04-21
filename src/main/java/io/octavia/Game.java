package io.octavia;

public class Game {
    private static final Grid grid = new Grid();
    private static final Turtle turtle = new Turtle();

    public static void main(String[] args) {
        while (true) {
            Cell cell = new Cell(true, 0, 0);
            Drawing.drawBoundaries(turtle, grid, cell);
            grid.updateGrid();
            try {
                Thread.sleep(500); // Pause for 500ms between updates
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // private static void drawGrid() {
    //     turtle.clear();
    //     Cell[][] cells = grid.getCells();

    //     for (Cell[] row : cells) {
    //         for (Cell cell : row) {
    //             if (cell.isAlive()) {
    //                 turtle.setColor("yellow");
    //                 double x = cell.getX() * 20; // Adjust cell size as needed
    //                 double y = cell.getY() * 20;

    //                 // Draw a filled rectangle for the alive cell
    //                 turtle.up();
    //                 turtle.goTo(x, y);
    //                 turtle.down();

    //                 for (int i = 0; i < 4; i++) {
    //                     turtle.forward(20); // Cell width
    //                     turtle.left(90);
    //                 }
    //             } else {
    //                 turtle.setColor("black");
    //                 double x = cell.getX() * 20; // Adjust cell size as needed
    //                 double y = cell.getY() * 20;
    
    //                 // Draw a filled rectangle for the dead cell
    //                 turtle.up();
    //                 turtle.goTo(x, y);
    //                 turtle.down();
    
    //                 for (int i = 0; i < 4; i++) {
    //                     turtle.forward(20); // Cell width
    //                     turtle.left(90);
    //                 }
    //             }
    //         }
    //     }
    // }
}
