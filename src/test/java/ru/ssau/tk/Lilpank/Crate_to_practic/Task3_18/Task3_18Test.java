package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_18;

import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.Person.Person;
import ru.ssau.tk.Lilpank.Crate_to_practic.Point.Point;
import ru.ssau.tk.Lilpank.Crate_to_practic.Point.task1_16.NamedPoint;
import ru.ssau.tk.Lilpank.Crate_to_practic.Task2_31.Matrix;

import static org.testng.Assert.*;

public class Task3_18Test {

    @Test
    public void testGetDescription() {
        Matrix matrix = new Matrix(3, 3);
        matrix.setAt(0, 0, 1);
        matrix.setAt(0, 1, 2);
        matrix.setAt(0, 2, 3);
        matrix.setAt(1, 0, 4);
        matrix.setAt(1, 1, 5);
        matrix.setAt(1, 2, 6);
        matrix.setAt(2, 0, 7);
        matrix.setAt(2, 1, 8);
        matrix.setAt(2, 2, 9);
        Task3_18.getDescription(matrix);
        Task3_18.getDescription(new Person("Denis", "Dorfirev", 828183));
        Task3_18.getDescription(new Point(0, 1, 2));
        Task3_18.getDescription(new NamedPoint(0, 1, 4, "X"));

    }
}