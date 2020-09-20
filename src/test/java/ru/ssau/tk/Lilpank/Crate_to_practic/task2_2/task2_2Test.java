package ru.ssau.tk.Lilpank.Crate_to_practic.task2_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class task2_2Test {

    @Test
    public void testSetNumber() {
        int[] array = new task2_2().setNumber(10);
        assertEquals(array.length,10);
        assertEquals(array[0],2);
        assertEquals(array[9],2);
        assertEquals(array[6],1);
    }
}