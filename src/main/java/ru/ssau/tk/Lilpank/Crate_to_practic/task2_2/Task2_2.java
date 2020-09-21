package ru.ssau.tk.Lilpank.Crate_to_practic.task2_2;

public class Task2_2 {
    public int[] setNumber(int size) {
        int[] array = new int[size];
        array[0] = 2;
        array[size - 1] = 2;
        for (int i = 1; i < array.length - 1; i++) {
            array[i] = 1;
        }
        return array;
    }
}