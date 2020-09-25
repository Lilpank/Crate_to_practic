package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_28;

public class Task2_28 {
    static int[] longToInt(long number) {
        return new int[]{(int) (number >>> 32), (int) (number)};
    }

    static long intToLong(int[] number) {
        return ((long) number[0] << 32) | ((long) number[1] & 4294967295L);
    }

}
