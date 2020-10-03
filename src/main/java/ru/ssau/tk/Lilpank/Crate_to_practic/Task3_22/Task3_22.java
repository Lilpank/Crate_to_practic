package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_22;

public class Task3_22 {
    static String getStringOfNumber(int number) {
        StringBuilder strOfNumber = new StringBuilder();
        for (int i = 0; i < number; i++) {
            strOfNumber.append(i);
        }
        return strOfNumber.toString();
    }
}
