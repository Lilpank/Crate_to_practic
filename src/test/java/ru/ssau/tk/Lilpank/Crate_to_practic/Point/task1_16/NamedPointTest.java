package ru.ssau.tk.Lilpank.Crate_to_practic.Point.task1_16;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    @Test
    public void _1PointConstructor() {
        NamedPoint namedPoint = new NamedPoint();
        assertEquals(namedPoint.length(), 0, 0.00001);
        assertEquals(namedPoint.getX(), 0, 0.00001);
        assertEquals(namedPoint.getName(), "Origin");
    }

    @Test
    public void _2PointConstructor() {
        NamedPoint namedPoint = new NamedPoint(6, 1, 2);
        assertNotEquals(namedPoint.length(), 6, 0.00001);
        namedPoint.setName("A");
        assertEquals(namedPoint.getName(), "A");
        assertEquals((int) namedPoint.length(), 6, 0.00001);
    }

    @Test
    public void _3PointConstructor() {
        NamedPoint namedPoint = new NamedPoint(2, 2, 1, "A");/*Английское А*/
        assertEquals(namedPoint.length(), 3, 0.00001);
        assertNotEquals(namedPoint.getName(), "А");/*Русское A*/
    }

    @Test
    public void testreset() {
        NamedPoint namedPoint = new NamedPoint(1, 1, 1, "B");
        assertEquals(namedPoint.getName(), "B");
        namedPoint.reset();
        assertEquals(namedPoint.getName(), "Absent");
    }

    @Test
    public void testTestToString() {
        assertEquals(new NamedPoint(2., 4., 3., "x").toString(), "x: [2.0, 4.0, 3.0]");
        assertEquals(new NamedPoint(-0, 0, 5).toString(), "[0.0, 0.0, 5.0]");
    }
}
