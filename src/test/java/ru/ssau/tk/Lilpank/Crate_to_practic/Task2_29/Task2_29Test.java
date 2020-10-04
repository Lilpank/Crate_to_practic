package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_29;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_29Test {

    @Test
    public void testGetArray() {
        int[] array = Task2_29.getArray(5, 3);
        assertEquals(array[0],3);
        assertEquals(array[1],4);
        assertEquals(array[2],5);
        assertEquals(array[3],1);
    }
}