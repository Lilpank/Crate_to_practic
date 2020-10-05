package ru.ssau.tk.Lilpank.Crate_to_practic.Task4_5;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.Task4_1.Task4_1;

import static org.testng.Assert.*;

public class DaughterTest {
    @Test
    void test() {
        Daughter temp = new Daughter();
        Assert.assertThrows(CloneNotSupportedException.class, temp::clone);

    }
}