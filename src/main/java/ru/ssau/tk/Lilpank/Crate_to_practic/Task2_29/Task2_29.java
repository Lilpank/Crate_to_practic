package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_29;

public class Task2_29 {
    static int[] getArray(int size, int indexBegining) {
        if (indexBegining >= size) {
            return null;
        } else {
            int[] result = new int[size];
            for (int i = 0; i < size; i++) {
                result[i + indexBegining - (i + indexBegining >= size ? size : 0)] = i + 1;
            }
            return result;
        }
    }
}