package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_22;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_22Test {

    @Test
    public void testGetStringOfNumber() {
        assertEquals(Task3_22.getStringOfNumber(3),"012");
        System.out.println(Task3_22.getStringOfNumber(10000));
    }
}