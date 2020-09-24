package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_20;

public class Task2_20 {
    static boolean setArray(int[] array) {
        int size = array.length;
        int _1count = 0;
        int _2count = 0;
        for (int k=0;k< array.length;k++) {
            if (array[k] % array[0] == 0)
                _1count++;
        }
        for (int j =0;j< array.length;j++) {
            if (array[j] % array[size-1] == 0)
                _2count++;
        }
        return _1count > _2count;
    }
}
