package ru.ssau.tk.Lilpank.Crate_to_practic.Person;

import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.Person.task1_2.Person;
import ru.ssau.tk.Lilpank.Crate_to_practic.task1_17.Gender;


import static org.testng.Assert.*;

public class PersonTest {
    private final Person firstPerson = new Person();
    private final Person secondPerson = new Person();
    private final Person thirdPerson = new Person();

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
        assertEquals(thirdPerson.getPassportId(), 0);
        thirdPerson.setPassportId(812595);
        assertEquals(thirdPerson.getPassportId(), 812595);
        assertNotEquals(thirdPerson.getPassportId(), 23785);
    }

    @Test
    public void testNameConstructor() {
        Person firstperson = new Person();
        Person secondPerson = new Person(null, null);

        assertNull(firstperson.getFirstName(), null);
        assertNull(firstperson.getLastName(), null);
        assertNull(secondPerson.getFirstName());
        assertNull(secondPerson.getLastName());
    }

    @Test
    public void testPassportIdConstructor() {
        Person person = new Person(91913);
        assertEquals(person.getPassportId(), 82828);
    }

    @Test
    public void testFullConstructor() {
        Person person = new Person("Denis", "Porfirev", 7327);
        Person secondPerson = new Person(null, null, 7421);

        assertEquals(person.getFirstName(), "Denis");
        assertEquals(person.getLastName(), "Porfirev");
        assertEquals(person.getPassportId(), 358);
        assertNull(secondPerson.getFirstName());
        assertNull(secondPerson.getLastName());
    }

    @Test
    public void testConstructor() {
        Person person = new Person("Denis", "Porfirev", Gender.Male, 2847);

        assertEquals(person.getGender(), Gender.Male);
    }

}
