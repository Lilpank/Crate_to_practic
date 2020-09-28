package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_11;

public class Task3_11 {
    static int theNumberOfStringArray(String[] array, String prefix, String postfix) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        for (String str : array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                number++;
            }
        }
        return number;
    }
}
