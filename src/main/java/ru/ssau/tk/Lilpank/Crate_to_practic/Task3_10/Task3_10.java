package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_10;

public class Task3_10 {
    static int set(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String string : array) {
            if (string.startsWith(prefix) && string.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
}
