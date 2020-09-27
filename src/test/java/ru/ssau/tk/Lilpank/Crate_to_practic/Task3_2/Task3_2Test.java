package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_2;

import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.Task3_1.Task3_1;

import static org.testng.Assert.*;

public class Task3_2Test {

    @Test
    public void testGetStr() {
        String temp = "hello world";
        new Task3_2().getStr(temp);
        String _2temp = "Хеллоу ворлд";
        new Task3_2().getStr(_2temp);
    }
}