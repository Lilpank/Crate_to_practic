package ru.ssau.tk.Lilpank.Crate_to_practic.task1_19;

import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.Person.task1_2.Person;
import ru.ssau.tk.Lilpank.Crate_to_practic.Point.Point;

import static org.testng.Assert.*;

public class PrintTypeTest {

    @Test
    public void testPrintType() {
        PrintType.printType("word");
        PrintType.printType('w');
        PrintType.printType((byte) 1);
        PrintType.printType((short) 1);
        PrintType.printType(1);
        PrintType.printType(3L);
        PrintType.printType(9.1f);
        PrintType.printType(1.2f);
        PrintType.printType(true);
        PrintType.printType(new Person());
        PrintType.printType(new Point(0, 0, 0));
        PrintType.printType(null);
    }

}