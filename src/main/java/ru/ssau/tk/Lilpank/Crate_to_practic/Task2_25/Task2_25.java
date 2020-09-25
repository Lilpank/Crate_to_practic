package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_25;

public class Task2_25 {
    static int[] getArrayNot(int[] _1array) {
        int[] _2array = new int[_1array.length];
        for (int i = 0; i < _2array.length; i++) {
            _2array[i] = _1array[i];
        }
        for (int i = 0; i < _2array.length; i++) {
            _2array[i] = ~_2array[i];
        }
        return _2array;
    }
}
