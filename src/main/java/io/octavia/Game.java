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
}
