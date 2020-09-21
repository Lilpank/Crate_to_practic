package ru.ssau.tk.Lilpank.Crate_to_practic.task2_3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class task2_3Test {
    @Test
    public void testSetNumber() {
        int[] arr = Task2_3.setNumber(5);
        assertEquals(arr[4],9);
        assertEquals(arr.length,5);
    }
}