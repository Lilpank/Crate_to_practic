package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_1Test {

    @Test
    public void testSetString() {
        String arrayStr = new String("str1,str2");
        new Task3_1().setString(arrayStr);
    }
}