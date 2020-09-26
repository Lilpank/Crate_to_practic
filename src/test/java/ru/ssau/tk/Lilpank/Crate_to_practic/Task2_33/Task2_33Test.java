package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_33;

import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.task2_3.Task2_3;

import static org.testng.Assert.*;

public class Task2_33Test {

    @Test
    public void testGetArraySting() {
        String[] array = new String[]{"hello","world"};
        Task2_33.getArraySting(array);
    }
}