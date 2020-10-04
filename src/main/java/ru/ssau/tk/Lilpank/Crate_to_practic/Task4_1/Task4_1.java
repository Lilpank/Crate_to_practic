package ru.ssau.tk.Lilpank.Crate_to_practic.Task4_1;

import ru.ssau.tk.Lilpank.Crate_to_practic.Person.Person;

public class Task4_1 {
    public static String getObjectPerson(Person obj) {
        if (obj.getFirstName() == null || obj.getLastName() == null) {
            throw new NullPointerException();
        }
        return obj.toString();
    }
}
