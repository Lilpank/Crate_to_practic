package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_32;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_32Test {

    @Test
    public void testSort() {
        Double[] array = new Double[]{Double.NaN,1.,2.};
        Task2_32.sort(array);
        assertEquals(array[1].doubleValue(),1.);
        assertEquals(array[0].doubleValue(),Double.NaN);
    }
}