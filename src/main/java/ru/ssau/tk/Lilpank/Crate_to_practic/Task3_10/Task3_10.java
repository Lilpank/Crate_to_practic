package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_10;

public class Task3_10 {
    static int set(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String str: array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
}
