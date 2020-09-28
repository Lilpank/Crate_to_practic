package ru.ssau.tk.Lilpank.Crate_to_practic.Task3_7;

import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.Task3_5.Task3_5;

import static org.testng.Assert.*;

public class Task3_7Test {

    @Test
    public void testGetIndexStr() {
        assertEquals(Task3_7.getIndexStr("Denis Dorfirev","Denis"),0);
        assertEquals(Task3_7.getIndexStr("Physic","ys"),2);
        assertEquals(Task3_7.getIndexStr("Abracadabra","da"),6);

    }
}