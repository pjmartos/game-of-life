package es.pjmartos;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameOfLifeTest {

    @Test
    public void anAliveCellShouldExist() {
        boolean aliveCell = aliveCell();

        assertTrue(aliveCell);
    }

    @Test
    public void aDeadCellShouldExist() {
        boolean deadCell = !aliveCell();

        assertFalse(deadCell);
    }

    @Test
    public void anAliveCellWithTwoAliveNeighboursShouldSurviveToNextGeneration() {
        int aliveNeighbours = 2;

        assertTrue(shouldRemainAlive(aliveNeighbours));
    }

    @Test
    public void anAliveCellWithThreeAliveNeighboursShouldSurviveToNextGeneration() {
        int aliveNeighbours = 3;

        assertTrue(shouldRemainAlive(aliveNeighbours));
    }

    private static boolean aliveCell() {
        return true;
    }

    private static boolean shouldRemainAlive(int aliveNeighbours) {
        return aliveNeighbours >= 2;
    }
}
