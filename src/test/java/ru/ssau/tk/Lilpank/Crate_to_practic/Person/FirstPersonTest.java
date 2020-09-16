package ru.ssau.tk.Lilpank.Crate_to_practic.Person;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class FirstPersonTest {
    @Test
    public void test() {
        Person firstPerson = new Person();
        Person secondPerson = new Person();

        firstPerson.setFirstName("");
        firstPerson.setLastName("");
        firstPerson.setPassportId(0);

        secondPerson.setFirstName("Jack");
        secondPerson.setLastName("Done");
        secondPerson.setPassportId(84842);

        assertEquals(firstPerson.getFirstName(), "");
        assertNotEquals(firstPerson.getLastName(), "John");
        assertEquals(firstPerson.getPassportId(), 0);

        assertEquals(secondPerson.getFirstName(),"Jack");
        assertEquals(secondPerson.getLastName(),"Done");
        assertNotEquals(secondPerson.getPassportId(),0);

    }
}