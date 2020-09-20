package ru.ssau.tk.Lilpank.Crate_to_practic.tasks2_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class task2_1Test {
    @Test
    public void testSetnumber() {
        int[] array = task2_1.setnumber(5);
        assertEquals(array.length, 5, 0.0001);

    }
}