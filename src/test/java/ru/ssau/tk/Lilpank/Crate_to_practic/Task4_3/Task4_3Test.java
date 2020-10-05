package ru.ssau.tk.Lilpank.Crate_to_practic.Task4_3;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.Task4_2.Task4_2;

import java.lang.reflect.Array;

import static org.testng.Assert.*;

public class Task4_3Test {

    @Test
    public void testGetCharOnIndex() {
        String[] arrayStr = new String[]{"Understandably","have","a","nice","day"};
        assertEquals(Task4_3.getCharOnIndex(arrayStr,0,0),
                'U');
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Task4_3.getCharOnIndex(arrayStr,20,0));
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> Task4_3.getCharOnIndex(arrayStr,0,20));
    }
}