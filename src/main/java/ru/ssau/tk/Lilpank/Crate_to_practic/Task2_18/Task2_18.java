package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_18;

public class Task2_18 {
    static Integer Maxvalue(int[] array) {
        if (array.length == 0) {
            return null;
        }
        int temp = 0;
        for (int i : array) {
            if (array[i + 1] > array[i]) {
                temp = array[i + 1];
            }
        }
        return temp;
    }
}