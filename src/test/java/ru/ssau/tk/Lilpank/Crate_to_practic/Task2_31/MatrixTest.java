package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_31;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatrixTest {

    @Test
    public void testTestToString() {
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.setAt(0, 0, 1);
        firstMatrix.setAt(0, 1, 2);
        firstMatrix.setAt(1, 0, 3);
        firstMatrix.setAt(1, 1, 4);
        System.out.println(firstMatrix);

    }
}