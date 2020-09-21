package ru.ssau.tk.Lilpank.Crate_to_practic.task2_8;

public class Task2_8 {
    static double[] setNumber(int size) {
        double[] array = new double[size];
        int j = 1;
        for (int i = 0; i < array.length; i++) {
            if (j % 3 == 0) {
                j++;
            }
            array[i] = j;
            j++;
        }
        return array;
    }
}