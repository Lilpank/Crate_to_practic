package ru.ssau.tk.Lilpank.Crate_to_practic.task1_15;

public abstract class Operation {
    public abstract double apply(double number);

    public double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}




