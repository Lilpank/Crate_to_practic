package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_28;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_28Test {

    @Test
    public void testLongToInt() {
        assertEquals(Task2_28.intToLong(Task2_28.longToInt(1095L)), 1095L);
        assertEquals(Task2_28.intToLong(Task2_28.longToInt(9L)), 9L);
    }
}