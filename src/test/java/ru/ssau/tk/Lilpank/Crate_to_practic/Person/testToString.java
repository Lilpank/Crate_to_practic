package ru.ssau.tk.Lilpank.Crate_to_practic.Person;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class testToString {

    @Test
    public void testToString() {
        Person _1Person = new Person("Dan", "Porfiref", 818182);
        Person _2Person = new Person("Dan", "Dorfiref", 302123);

        assertEquals(_1Person.toString(), "Dan Porfiref");
        assertEquals(_2Person.toString(), "Dan Dorfiref");
        _2Person.setLastName("");
        assertEquals(_2Person.toString(), "Dan");
        _1Person.setFirstName("");
        _1Person.setLastName("");
        assertEquals(_1Person.toString(), "");
    }
}