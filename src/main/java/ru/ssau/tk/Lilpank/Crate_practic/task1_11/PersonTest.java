package ru.ssau.tk.Lilpank.Crate_practic.task1_11;

import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_practic.task1.Person;

import static org.testng.Assert.*;

public class PersonTest {
    private Person firstPerson = new Person();
    private Person secondPerson = new Person();
    private Person thirdPerson = new Person();

    @Test
    public void Test_null() {

        assertNull(firstPerson.getFirstName(), null);
        assertNull(secondPerson.getLastName(), null);
        assertEquals(thirdPerson.getPassportId(), 0);
    }

    @Test
    public void Test() {

    }
}