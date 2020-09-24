package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_18;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_18Test {

    @Test
    public void testMaxvalue() {
        int[] array = new int[]{121, 43, 81, 22, 6};
        assertNull(Task2_18.Maxvalue(new int[]{}), null);

    }
}