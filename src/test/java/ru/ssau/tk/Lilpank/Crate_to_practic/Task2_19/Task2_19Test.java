package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_19;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_19Test {

    @Test
    public void testSetArrayEven() {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,20};
                            //  0 1 2 3 4 5 6 7 8 9
        assertEquals(Task2_19.setArrayEven(array),25);//1+3+5+7+9
    }
}