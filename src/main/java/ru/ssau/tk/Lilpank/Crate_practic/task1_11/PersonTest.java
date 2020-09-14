package ru.ssau.tk.Lilpank.Crate_practic.task1_11;

import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_practic.task1_2.*;

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

        assertEquals(firstperson.getFirstName(), null);
        assertEquals(firstperson.getLastName(), null);
        assertNull(secondPerson.getFirstName());
        assertNull(secondPerson.getLastName());
    }

        @Test
        public void testPassportIdConstructor () {
            Person person = new Person(358);
            assertEquals(person.getPassportId(), 358);
        }

        @Test
        public void testFullConstructor () {
            Person person = new Person("Denis", "Porfirev", 358);
            Person secondPerson = new Person(null, null, 21);

            assertEquals(person.getFirstName(), "Denis");
            assertEquals(person.getLastName(), "Porfirev");
            assertEquals(person.getPassportId(), 358);
            assertNull(secondPerson.getFirstName());
            assertNull(secondPerson.getLastName());
        }
    }
