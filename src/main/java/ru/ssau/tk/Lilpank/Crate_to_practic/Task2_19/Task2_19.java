package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_19;

public class Task2_19 {
    static int setArrayEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}