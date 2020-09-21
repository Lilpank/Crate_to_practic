package ru.ssau.tk.Lilpank.Crate_to_practic.task2_4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class task2_4Test {

    @Test
    public void testSetNumber() {
        int[] arr = Task2_4.setNumber(5);
        assertEquals(arr[4], 2);
        assertEquals(arr[0], 10);
    }
}