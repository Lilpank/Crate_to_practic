package ru.ssau.tk.Lilpank.Crate_practic.task1_4;

import ru.ssau.tk.Lilpank.Crate_practic.task1_3.*;

public class Points {
    private Points() {

    }

    public static Point sum(Point obj1, Point obj2) {
        return new Point(obj1.getX()+obj2.getX(),obj1.getY()+obj2.getY(),obj1.getZ()+obj2.getZ());
    }

    public static Point subtract(Point obj1, Point obj2) {
        return new Point(obj1.getX()-obj2.getX(),obj1.getY()-obj2.getY(),obj1.getZ()-obj2.getZ());
    }

    public static Point multiply(Point obj1, Point obj2) {
        return new Point(obj1.getX()*obj2.getX(),obj1.getY()*obj2.getY(),obj1.getZ()*obj2.getZ());
    }

    public static Point devide(Point obj1, Point obj2) {
        return new Point(obj1.getX()/obj2.getX(),obj1.getY()/obj2.getY(),obj1.getZ()/obj2.getZ());
    }
}
