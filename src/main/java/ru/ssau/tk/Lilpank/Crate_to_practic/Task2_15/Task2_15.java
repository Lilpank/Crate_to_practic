package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_15;

public class Task2_15 {
    static boolean setArray(int[] arr, int number) {
        for (int j : arr) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}

