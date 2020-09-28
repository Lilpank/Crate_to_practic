package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_11;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_11Test {

    @Test
    public void testTheNumberOfStringArray() {
        String[] array = new String[]{"Understandble", "have", " a ", "nice ", " day"};
        assertEquals(Task3_11.theNumberOfStringArray(array, "h", "e"), 1);
        assertEquals(Task3_11.theNumberOfStringArray(array,"d","y"),1);
    }
}