package ru.ssau.tk.Lilpank.Crate_to_practic.task1_20;

import org.testng.annotations.Test;
import sun.font.TrueTypeFont;

import static org.testng.Assert.*;

public class WrapTest {
    @Test
    public void test() {
        int i = 5;
        int j = 3;
        boolean b = true;
        Integer I = Wrap.boxing(i);
        Boolean conditionTrue = Wrap.boxing(true);
        Boolean conditionFalse = Wrap.autoBoxing(false);
        Boolean conditionNull = null;
        if (conditionTrue){
            System.out.println("Этот блок кода будет работать");
        }
        if (Boolean.TRUE.equals(conditionNull)) {
            System.out.println("Этот блок кода не будет работать");
        }
        if (Boolean.TRUE.equals(conditionFalse)) {
            System.out.println("Этот блок кода не будет работать");
        }
    }
}