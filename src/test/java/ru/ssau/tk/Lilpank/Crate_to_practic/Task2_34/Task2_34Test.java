package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_34;

import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.Task2_33.Task2_33;

import static org.testng.Assert.*;

public class Task2_34Test {

    @Test
    public void testMultiply() {
        assertEquals(Task2_34.multiply(new Double[]{1., 2., Double.NaN,
                Double.NEGATIVE_INFINITY,
                Double.POSITIVE_INFINITY}).doubleValue(),
                10.);
    }
}