package ru.ssau.tk.Lilpank.Crate_to_practic.task2_3;

public class task2_3 {
    public static int[] setNumber(int size) {
        int[] arr = new int[size];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
            count = count + 2;
        }
        return arr;
    }
}
