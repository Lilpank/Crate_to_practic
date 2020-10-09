package ru.ssau.tk.Lilpank.Crate_to_practic.Person;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.Task4_1.Task4_1;
import ru.ssau.tk.Lilpank.Crate_to_practic.Task4_5.Task4_5;

import java.io.*;

import static org.testng.Assert.*;

public class Task4_6Test {

    @Test
    public void testSet() throws IOException {
        Person obj = new Person();
        String fileName = "";

        Assert.assertThrows(FileNotFoundException.class, () -> Task4_6.set(new ObjectOutputStream(new FileOutputStream(fileName)), obj));
        Assert.assertThrows(ClassCastException.class, () -> Task4_6.set(new ByteArrayOutputStream(), obj));
    }
}