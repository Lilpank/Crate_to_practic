package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_9;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_9Test {

    @Test
    public void testGetIndexOf() {
        assertEquals(Task3_9.getIndexOf("Denis Dorfirev","is"),3);
        assertEquals(Task3_9.getIndexOf("Hello world","Hell"),0);
    }
}