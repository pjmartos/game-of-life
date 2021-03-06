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
        boolean cellStatus = aliveCell();
        int aliveNeighbours = 2;

        assertTrue(shouldRemainAlive(cellStatus, aliveNeighbours));
    }

    @Test
    public void anAliveCellWithThreeAliveNeighboursShouldSurviveToNextGeneration() {
        boolean cellStatus = aliveCell();
        int aliveNeighbours = 3;

        assertTrue(shouldRemainAlive(cellStatus, aliveNeighbours));
    }

    @Test
    public void aDeadCellWithTwoAliveNeighboursShouldRemainDeadInNextGeneration() {
        boolean cellStatus = !aliveCell();
        int aliveNeighbours = 2;

        assertFalse(shouldRemainAlive(cellStatus, aliveNeighbours));
    }

    @Test
    public void aDeadCellWithThreeAliveNeighboursShouldComeBackToLifeInNextGeneration() {
        boolean cellStatus = !aliveCell();
        int aliveNeighbours = 3;

        assertTrue(shouldRemainAlive(cellStatus, aliveNeighbours));
    }

    @Test
    public void anAliveCellWithFourAliveNeighboursShouldDieFromOverPopulationInNextGeneration() {
        boolean cellStatus = aliveCell();
        int aliveNeighbours = 4;

        assertFalse(shouldRemainAlive(cellStatus, aliveNeighbours));
    }

    @Test
    public void anAliveCellWithOneAliveNeighbourShouldDieFromStarvationInNextGeneration() {
        boolean cellStatus = aliveCell();
        int aliveNeighbours = 1;

        assertFalse(shouldRemainAlive(cellStatus, aliveNeighbours));
    }

    private static boolean aliveCell() {
        return true;
    }

    private static boolean shouldRemainAlive(boolean cellStatus, int aliveNeighbours) {
        return aliveNeighbours == 3 || cellStatus && aliveNeighbours == 2;
    }
}
