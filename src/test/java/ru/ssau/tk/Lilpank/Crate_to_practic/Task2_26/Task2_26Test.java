package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_26;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_26Test {

    @Test
    public void testGetPairwiseSum() {
        assertEquals(Task2_26.getPairwiseSum(new int[]{10, 4, 8, 2, 9}), new int[]{14, 10, 9});
        assertEquals(Task2_26.getPairwiseSum(new int[]{10, 4, 8, 2, 9, 1, 2, 5}), new int[]{14, 10, 10, 7});

    }
}