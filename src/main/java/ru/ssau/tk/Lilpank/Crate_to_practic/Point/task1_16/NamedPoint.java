package ru.ssau.tk.Lilpank.Crate_to_practic.Point.task1_16;

import ru.ssau.tk.Lilpank.Crate_to_practic.Point.Point;
import ru.ssau.tk.Lilpank.Crate_to_practic.task1_18.Resettable;

public class NamedPoint extends Point implements Resettable {
    public String name;

    public NamedPoint() {
        this(0, 0, 0, "Origin");
    }

    public NamedPoint(double x, double y, double z) {
        super(x, y, z);

    }

    public NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void reset() {
        name = "Absent";
    }
}