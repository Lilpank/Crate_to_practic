package ru.ssau.tk.Lilpank.Crate_to_practic.Task4_8;

public class Checked extends Exception {
    public static Checked throwCheckedException() throws Checked {
        throw new Checked();
    }

    public static void throwUnchekedException() throws Checked {
        UnChecked a = new UnChecked(throwCheckedException());
    }
}
