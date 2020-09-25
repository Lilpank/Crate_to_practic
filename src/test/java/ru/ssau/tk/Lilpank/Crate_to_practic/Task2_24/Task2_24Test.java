package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_24;

import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.task2_2.Task2_2;

import static org.testng.Assert.*;

public class Task2_24Test {

    @Test
    public void testGetNot() {
        int[] array = new int[]{1,2,3,4,5};
        Task2_24.getNot(array);
        assertEquals(array[0],-2);
        Task2_24.getNot(array);
        assertEquals(array[0],1);
    }
}