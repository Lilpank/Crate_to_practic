package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_20;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_20Test {

    @Test
    public void testGetUnifiedStr() {
        String[] str = {"Understandable", "have", "a", "nice", "day"};
        assertEquals(Task3_20.getUnifiedStr(str), "Understandable, have, a, nice, day");
    }
}