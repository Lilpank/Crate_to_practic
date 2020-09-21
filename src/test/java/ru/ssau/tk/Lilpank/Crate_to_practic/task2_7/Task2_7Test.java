package ru.ssau.tk.Lilpank.Crate_to_practic.task2_7;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_7Test {
    double accuracy = 0.00001;
    @Test
    public void _1test() throws Exception {
        double[] _1SEqution = Task2_7.setnumbers(1, 1, -2);
        assertEquals(_1SEqution[0], 1, accuracy);
        assertEquals(_1SEqution[1], -2, accuracy);
    }

    @Test
    public void _2test() throws Exception {
        double[] _2Eqution = Task2_7.setnumbers(0, 2, -4);
        assertEquals(_2Eqution[0], 2, accuracy);
    }

    @Test
    public void testNuN() throws Exception {
        try {
            double[] DoesNotExist = Task2_7.setnumbers(0, 0, 8);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Решения нет.");
        }

        try {
            double[] emptyEqution = Task2_7.setnumbers(0, 0, 0);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Решение принадлежит области комлпексных чисел.");
        }

        try {
            double[] ComplexNumbers = Task2_7.setnumbers(1, 3, 7);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Решение не относится к области вещественных чисел.");
        }
    }
}