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
    public void anAliveCellWithThreeAliveNeighboursShouldSurviveToNextGeneration() {
        boolean aliveCell = aliveCell();
        int aliveNeighbours = 3;

        assertTrue(aliveCell && aliveNeighbours == 3);
    }

    @Test
    public void anAliveCellWithTwoAliveNeighboursShouldSurviveToNextGeneration() {
        boolean aliveCell = aliveCell();
        int aliveNeighbours = 2;

        assertTrue(aliveCell && aliveNeighbours == 2);
    }

    private static boolean aliveCell() {
        return true;
    }
}
