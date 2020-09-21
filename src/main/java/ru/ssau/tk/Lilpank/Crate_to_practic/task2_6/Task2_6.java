package ru.ssau.tk.Lilpank.Crate_to_practic.task2_6;

public class Task2_6 {
    public static int[] setnumber(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i*i;
        }
        return array;
    }

}
