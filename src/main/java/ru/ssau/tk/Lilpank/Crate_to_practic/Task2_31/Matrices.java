package ru.ssau.tk.Lilpank.Crate_to_practic.Task2_31;

public class Matrices {

    static Matrix getMatrixMultiplyOnNumber(Matrix matrix, int number) {
        Matrix resultMatrix = new Matrix(matrix.getN(), matrix.getM());
        for (int i = 0; i < matrix.getN(); i++) {
            for (int j = 0; j < matrix.getM(); i++) {
                resultMatrix.setAt(i, j, matrix.getAt(i, j) * number);
            }
        }
        return resultMatrix;
    }

    static Matrix getMatrixPlus(Matrix matrix1, Matrix matrix2) {
        Matrix resultMatrix = new Matrix(matrix1.getN(), matrix1.getM());
        if (chekMatrixSize(matrix1, matrix2)) {
            return null;
        } else for (int i = 0; i < matrix1.getN(); i++) {
            for (int j = 0; j < matrix1.getM(); j++)
                resultMatrix.setAt(i, j, matrix1.getAt(i, j) + matrix2.getAt(i, j));
        }
        return resultMatrix;
    }


    static boolean chekMatrixSize(Matrix matrix1, Matrix matrix2) {
        return !(matrix1.getM() == matrix2.getM() || matrix1.getN() == matrix2.getM());
    }

    static Matrix getMatrixMultiply(Matrix matrix1, Matrix matrix2) {
        Matrix resultMatrix = new Matrix(matrix1.getN(), matrix1.getM());
        if (chekMatrixSize(matrix1, matrix2)) {
            return null;
        } else {
            for (int i = 0; i < matrix1.getN(); i++) {
                for (int j = 0; j < matrix1.getN(); j++) {
                    for (int k = 0; k < matrix1.getN(); k++) {
                        resultMatrix.setAt(i, j, matrix1.getAt(i, k) * matrix2.getAt(k, j));
                    }
                }
            }
        }
        return resultMatrix;
    }
}
