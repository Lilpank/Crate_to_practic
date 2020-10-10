package ru.ssau.tk.Lilpank.Crate_to_practic.Task4_7;
import ru.ssau.tk.Lilpank.Crate_to_practic.Task2_31.Matrices;

public class IncompatibleDimensionsException extends Throwable   {
    public IncompatibleDimensionsException() {
        this("Матрицы несовместимы!");
    }

    public IncompatibleDimensionsException(String str) {
        System.out.println(str);

    }
}
