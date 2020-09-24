package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_23;

import java.util.Arrays;

public class Task2_23 {
    static void setArray(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            min = array[i] < min ? array[i] : min;
            max = array[i] > max ? array[i] : max;
        }

        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                indexMin = i;
            }
            if (array[i] == max) {
                indexMax = i;
            }
        }
        array[indexMin] = max;
        array[indexMax] = min;
    }
}
