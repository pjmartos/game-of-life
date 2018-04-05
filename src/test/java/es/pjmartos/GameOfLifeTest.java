package es.pjmartos;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameOfLifeTest {

    @Test
    public void anAliveCellShouldExist() {
        boolean aliveCell = true;

        assertTrue(aliveCell);
    }

    @Test
    public void aDeadCellShouldExist() {
        boolean deadCell = !true;

        assertFalse(deadCell);
    }
}
