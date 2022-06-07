package io.octavia;

public class Game {
    public static void main(String[] args) {
        Cell cell = new Cell(true, 0, 0);
        Grid grid = new Grid();
        Turtle turtle = new Turtle();
        drawBoundaries(turtle, grid, cell);
    }

    static void drawBoundaries(Turtle turtle, Grid grid, Cell cell) {
        turtle.up();
        turtle.goTo(grid.getMinX(), grid.getMinY());
        turtle.down();

        for (int i = 0; i < 4; i++) {
            turtle.forward(500);
            turtle.left(90);
        }

        drawCells(turtle, grid, cell);
    }

    static void drawCells(Turtle turtle, Grid grid, Cell cell){
        turtle.speed(10);
        for (int i = 1; i <= 25; i++) {
            for (int j = 1; j <= 25; j++) {
                turtle.forward(cell.getCellWidth());

                for (int k = 1; k <= 4; k++) {
                    turtle.left(90);
                    turtle.forward(cell.getCellWidth());
                }
            }
            turtle.up();
            turtle.goTo(grid.getMinX(), grid.getMinY());
            turtle.down();
            turtle.left(90);
            turtle.forward(cell.getCellWidth()*i);
            turtle.right(90);
        }

    }
}
