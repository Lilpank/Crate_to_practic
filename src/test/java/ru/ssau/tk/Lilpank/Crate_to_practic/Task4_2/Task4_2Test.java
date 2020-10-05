package ru.ssau.tk.Lilpank.Crate_to_practic.Task4_2;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_2Test {

    @Test
    public void testSet() {
        String[] str = {"Understandably", "have", "a", "nice", "day"};
        assertEquals(Task4_2.getSymbolOnIndex(str, 0), new String[]{"U", "h", "a", "n", "d"});
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Task4_2.getSymbolOnIndex(str, 1));

        Assert.assertThrows(NullPointerException.class,
                () -> Task4_2.getSymbolOnIndex(null, 0));
        String[] str1 = {null, "null"};
        Assert.assertThrows(NullPointerException.class,
                () -> Task4_2.getSymbolOnIndex(str1, 0));
    }
}