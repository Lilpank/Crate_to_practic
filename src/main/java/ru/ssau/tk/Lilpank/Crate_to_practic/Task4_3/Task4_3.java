package ru.ssau.tk.Lilpank.Crate_to_practic.Task4_3;

public class Task4_3 {
    public static char getCharOnIndex(String[] arrayStr, int n, int m) {
        if (n > arrayStr.length) {
            throw new StringIndexOutOfBoundsException();
        }
        if (m > arrayStr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return arrayStr[n].charAt(m);
    }
}
