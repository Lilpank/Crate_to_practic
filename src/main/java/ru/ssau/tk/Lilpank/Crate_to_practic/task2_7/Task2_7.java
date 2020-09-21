package ru.ssau.tk.Lilpank.Crate_to_practic.task2_7;

public class Task2_7 {
    public static double[] setnumbers(double a, double b, double c) throws Exception {
        if (a == 0) {
            if (b == 0) {
                if (c != 0) {
                    throw new Exception("Решения нет.");
                } else {
                    throw new Exception("Решение принадлежит области комлпексных чисел.");
                }
            } else {
                return new double[]{-c / b};// bx+c = 0
            }
        } else {
            double d = b * b - 4 * a * c;
            if (d > 0) {
                return new double[]{(-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a)};
            } else if (d == 0) {
                return new double[]{-b / (2 * a)};
            } else {
                throw new NullPointerException("Решение не относится к области вещественных чисел.");
            }
        }
    }
}
