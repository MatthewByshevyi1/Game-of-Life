/**
 * Model for Conway's Game of Life.
 *
 * This class stores the society in a 2D boolean array.
 * true  = live cell
 * false = empty location
 *
 * IMPORTANT FOR THIS PROJECT:
 * The board does NOT wrap around. Any location outside the array is simply
 * ignored when counting neighbors.
 */
public class GameOfLife {

    private boolean[][] society;

    /**
     * Creates an empty society with the requested number of rows and columns.
     */
    public GameOfLife(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Rows and columns must be positive.");
        }

        
    }

    /** Returns the number of rows in the society. */
    public int numberOfRows() {
        return -1;
    }

    /** Returns the number of columns in the society. */
    public int numberOfColumns() {
        return -1;
    }

    /** Makes the location at row, col alive. */
    public void growCellAt(int row, int col) {
        
    }

    /** Makes the location at row, col dead. */
    public void killCellAt(int row, int col) {
        
    }

    /** Returns true if the location contains a live cell. */
    public boolean cellAt(int row, int col) {
        return false;
    }

    /** Makes every location in the society dead. */
    public void clear() {
        for (int r = 0; r < society.length; r++) {
            for (int c = 0; c < society[r].length; c++) {
                society[r][c] = false;
            }
        }
    }

    /**
     * Counts the live neighbors surrounding one location.
     *
     * A location can have at most eight neighbors. Locations outside the
     * board DO NOT wrap around to the other side.
     *
     * TODO: Complete this method.
     */
    public int neighborCount(int row, int col) {
        int count = 0;

        for (int r = Math.max(row-1,0); r <= Math.min(row+1,society.length-1); r++) {
            for (int c = Math.max(col-1,0); c <= Math.min(col+1,society[r].length-1); c++) {
                if (r == row && c == col) {
                    continue;
                }
                if (society[r][c]) {
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * Advances the entire society by one generation.
     *
     * Rules:
     * 1. A dead cell with exactly 3 live neighbors becomes alive.
     * 2. A live cell with 2 or 3 live neighbors survives.
     * 3. A live cell with fewer than 2 neighbors dies from isolation.
     * 4. A live cell with more than 3 neighbors dies from overpopulation.
     *
     * TODO: Complete this method.
     */
    public void update() {
        // TODO: Create a SECOND 2D boolean array for the next generation.
        //
        // IMPORTANT:
        // Do not change society while you are still using it to calculate
        // neighbors. Every cell in the new generation must be based on the
        // same old generation.
    }

    /**
     * Returns a text version of the board.
     * O = live cell
     * . = dead cell
     *
     * TODO: Complete this method.
     */
    @Override
    public String toString() {
        // TODO: Use nested loops to build one String containing the board.
        //       Add a newline after every row.

        return "Complete toString() to display the text version of the board.\n";
    }
}