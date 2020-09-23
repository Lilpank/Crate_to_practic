package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_10;

public class Task2_10 {
    static double[] getGeometricProgression(double beginElement, double step, int dim) {
        double[] array = new double[dim];
        array[0] = beginElement;
        for(int i = 1; i < dim; i++) {
            array[i] = array[i-1]*step;
        }
        return array;
    }
}