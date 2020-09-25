package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_27;

public class Task2_27 {
    static boolean[] isEven(int[] array) {
        boolean[] _1array = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            _1array[i] = array[i] % 2 == 0;
        }
        return _1array;
    }
}
