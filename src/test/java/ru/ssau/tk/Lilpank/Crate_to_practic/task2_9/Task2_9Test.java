package ru.ssau.tk.Lilpank.Crate_to_practic.task2_9;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_9Test {

    @Test
    public void testSetfunction() {
        double accuracy = 0.00001;
        int[] array = Task2_9.setfunction(1, 3, 11);
        assertEquals(array[10], 31, accuracy);
    }
}