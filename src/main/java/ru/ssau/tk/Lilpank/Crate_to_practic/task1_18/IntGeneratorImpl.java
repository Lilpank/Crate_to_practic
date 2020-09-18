package ru.ssau.tk.Lilpank.Crate_to_practic.task1_18;

public class IntGeneratorImpl implements IntGenerator {
    private int count = 0;

    @Override
    public int nexInt() {
        return count++;
    }
}
