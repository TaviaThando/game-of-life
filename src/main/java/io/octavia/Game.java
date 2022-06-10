package io.octavia;

public class Game {
    private static Cell cell;
    private static final Grid grid = new Grid();
    private static final Turtle turtle = new Turtle();

    public static void main(String[] args) {
        cell = new Cell(true, 0, 0);
        Drawing.drawBoundaries(turtle, grid, cell);
    }

}
