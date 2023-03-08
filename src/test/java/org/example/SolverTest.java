package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolverTest {
    Solver solver;

    @Before
    public void setupEachTest() {
        solver = new Solver();
    }

    @Test
    public void discriminantHasTwo() {
        int result = solver.toSolve(1, -5, 2);
        assertEquals(2, result);
    }

    @Test
    public void discriminantHasZero() {
        int result = solver.toSolve(50, 0, 22);
        assertEquals(0, result);
    }

    @Test
    public void discriminantHasOne() {
        int result = solver.toSolve(1, 6, 9);
        assertEquals(1, result);
    }


}
