package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_10;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_10Test {

    @Test
    public void testGetGeometricProgression() {
        double[] array = Task2_10.getGeometricProgression(2, 2, 11);
        assertEquals(array[5], 64, 0.00001);
    }
}