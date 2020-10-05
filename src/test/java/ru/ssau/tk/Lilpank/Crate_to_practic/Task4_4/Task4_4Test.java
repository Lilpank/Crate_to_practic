package ru.ssau.tk.Lilpank.Crate_to_practic.Task4_4;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.Task4_1.Task4_1;

import static org.testng.Assert.*;

public class Task4_4Test {

    @Test
    public void testGetIntOfString() {
        Task4_4.getIntOfString("10","5"); // output: 2
        Assert.assertThrows(ArithmeticException.class,
                () ->   Task4_4.getIntOfString("10","0"));
        Assert.assertThrows(NumberFormatException.class,
                () ->    Task4_4.getIntOfString("r","1"));
        Assert.assertThrows(NumberFormatException.class,
                () ->    Task4_4.getIntOfString("r","a"));
    }
}