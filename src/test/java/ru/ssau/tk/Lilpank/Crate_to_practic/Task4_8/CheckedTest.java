package ru.ssau.tk.Lilpank.Crate_to_practic.Task4_8;

import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.Check1_13to14.Check;

import static org.testng.Assert.*;
import static ru.ssau.tk.Lilpank.Crate_to_practic.Task4_8.Checked.*;
import static ru.ssau.tk.Lilpank.Crate_to_practic.Task4_8.Checked.throwUnchekedException;

public class CheckedTest {
    @Test
    public void test() {
        try {
            throwUnchekedException();
        } catch (Checked e) {
            e.getCause();
        }

    }
}