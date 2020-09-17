package ru.ssau.tk.Lilpank.Crate_to_practic.OperationTest;

import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.task1_15.*;

import static org.testng.Assert.*;

public class OperationTest {
    private static final double alfa = 0.00001;
    private final Operation a = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(a.apply(120), 120, alfa);
        assertEquals(a.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, alfa);
        assertEquals(a.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, alfa);
        assertEquals(a.apply(Double.NaN), Double.NaN, alfa);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(a.applyTriple(50), 50, alfa);
        assertEquals(a.applyTriple(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, alfa);
        assertEquals(a.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, alfa);
        assertEquals(a.applyTriple(Double.NaN), Double.NaN, alfa);
    }
}