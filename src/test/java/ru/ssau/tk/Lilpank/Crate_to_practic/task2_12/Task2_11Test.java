package ru.ssau.tk.Lilpank.Crate_to_practic.task2_12;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_11Test {

    @Test
    public void testGetDividersOfNumbers() {
        double[] firstArray = Task2_11.getDividersOfNumbers(6);
        assertEquals(firstArray[0], 1, 0.0001);
        assertEquals(firstArray[1], 2, 0.0001);
        assertEquals(firstArray[2], 3, 0.0001);
        assertEquals(firstArray[3], 6, 0.0001);
        assertEquals(firstArray.length, 4, 0.0001);
    }
}