package ru.ssau.tk.Lilpank.Crate_to_practic.Task4_1;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.Lilpank.Crate_to_practic.Person.Person;

import static org.testng.Assert.*;

public class Task4_1Test {

    @Test
    public void testGetObjectPerson() {
        Person p1 = new Person("Dan", "Porfirev");
        assertEquals(Task4_1.getObjectPerson(p1), "Dan Porfirev");
        Person p2 = new Person(null, null);
        // assertNull(Task4_1.getObjectPerson(p2)); выводит: java.lang.NullPointerException
        Assert.assertThrows(NullPointerException.class, () -> Task4_1.getObjectPerson(p2));
    }
}