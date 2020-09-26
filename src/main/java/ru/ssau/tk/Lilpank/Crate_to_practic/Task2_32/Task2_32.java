package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_32;

import java.util.Arrays;

public class Task2_32 {
    static void sort(Double[] array) {
        for (Double j : array) {
            if (j.isNaN()) {
                return;
            } else {
                Arrays.sort(array);
            }
        }
    }
}
