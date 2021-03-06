package ru.ssau.tk.Lilpank.Crate_to_practic.Point;

public class Point {
    private double x = 0, y = 0, z = 0;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "[" +
                x +", "
                +y +", "
                +z +
                ']';
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }


}

class Task1_3 {
    public static void main(String[] args) {
        Point onePoint = new Point(1, 1, 1);
        Point secondPoint = new Point(7, -1, 0);
        Point thirdPoint = new Point(0, -4, -7);

        System.out.println(onePoint);
        System.out.println(secondPoint);
        System.out.println(thirdPoint);
    }
}