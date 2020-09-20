package ru.ssau.tk.Lilpank.Crate_to_practic.task1_20;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WrapTest {
    @Test
    public void test() {
        int i = 5;
        int j = 3;
        boolean b = true;
        Integer I = Wrap.boxing(i);
        Boolean conditionTrue = Wrap.boxing(b);
        Boolean conditionFalse = Wrap.autoBoxing(!b);
        Boolean conditionNull = null;
    }
}