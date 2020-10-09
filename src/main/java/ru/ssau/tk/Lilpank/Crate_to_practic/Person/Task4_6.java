package ru.ssau.tk.Lilpank.Crate_to_practic.Person;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Task4_6 {
    public static void set(OutputStream out,Object obj) throws IOException {
        ((ObjectOutputStream) out).writeObject(obj);
    }
}
