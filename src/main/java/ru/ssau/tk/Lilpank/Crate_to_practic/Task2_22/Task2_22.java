package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_22;

public class Task2_22 {
    static int getIndexOftenNumber(int[] array, int number) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                j = i;
            }
        }
        return j;
    }
}
