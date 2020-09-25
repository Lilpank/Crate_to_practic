package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_26;

public class Task2_26 {
    static int[] getPairwiseSum(int[] array) {
        int[] _1array = new int[array.length / 2 + (array.length % 2 == 0 ? 0 : 1)];
        for (int i = 0; i < _1array.length; i++) {
            _1array[i] = array[2 * i] + (2 * i + 1 < array.length ? array[2 * i + 1] : 0);
        }
        return _1array;
    }
}
