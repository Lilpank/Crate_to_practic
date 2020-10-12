package ru.ssau.tk.Lilpank.Crate_to_practic.Task4_8;

import ru.ssau.tk.Lilpank.Crate_to_practic.Task4_8.*;
import org.testng.annotations.Test;

import static ru.ssau.tk.Lilpank.Crate_to_practic.Task4_8.Checked.throwCheckedException;

public class CheckedTest {
    @Test
    public void test() {
        try {
            throwCheckedException();
        } catch (Checked e) {
            e.getCause();
        }
    }
}