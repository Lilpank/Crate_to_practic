package ru.ssau.tk.Lilpank.Crate_to_practic.task2_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class task2_1Test {
    @Test
    public void testSetnumber() {
        int[] array = Task2_1.setnumber(5);
        assertEquals(array.length, 5);
    }
}