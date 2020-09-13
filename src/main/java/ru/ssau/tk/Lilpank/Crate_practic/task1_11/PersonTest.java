package ru.ssau.tk.Lilpank.Crate_practic.task1_11;

import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_practic.task1.Person;

import static org.testng.Assert.*;

public class PersonTest {
    private Person firstPerson = new Person();
    private Person secondPerson = new Person();
    private Person thirdPerson = new Person();

    @Test
    public void testFirstName() {
        assertNull(firstPerson.getFirstName(), null);
        assertNotEquals(firstPerson.getFirstName(), "");
        firstPerson.setFirstName("");
        assertEquals(firstPerson.getFirstName(), "");
        firstPerson.setFirstName("Gena");
        assertEquals(firstPerson.getFirstName(), "Gena");
    }

    @Test
    public void testLastName() {
        assertNull(secondPerson.getLastName(), null);
        assertNotEquals(secondPerson.getLastName(), "");
        secondPerson.setLastName("");
        assertEquals(secondPerson.getLastName(), "");
        secondPerson.setLastName("Gena");
        assertNotEquals(secondPerson.getLastName(), "Byckin");
    }

    @Test
    public void testPassportID() {
        assertEquals(thirdPerson.getPassportId(),0);
        thirdPerson.setPassportId(812595);
        assertEquals(thirdPerson.getPassportId(),812595);
        assertNotEquals(thirdPerson.getPassportId(),23785);
    }
}