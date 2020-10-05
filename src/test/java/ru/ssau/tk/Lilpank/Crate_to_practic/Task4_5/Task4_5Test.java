package ru.ssau.tk.Lilpank.Crate_to_practic.Task4_5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_5Test {

    @Test
    public void testTestClone() throws CloneNotSupportedException {
      Daughter temp = new Daughter();
      Daughter copy = (Daughter) temp.clone();
      Task4_5 temp1 = new Task4_5();
      Task4_5 copy1 = (Task4_5) temp1.clone();
    }
}