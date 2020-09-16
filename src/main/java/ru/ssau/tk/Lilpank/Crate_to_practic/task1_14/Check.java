package ru.ssau.tk.Lilpank.Crate_to_practic.task1_14;

import ru.ssau.tk.Lilpank.Crate_to_practic.Person.task1_2.*;

public class Check {
    public static void main(String[] args) {
        Person person = new Person();/*Создался объект в этой среде*/
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getFirstName());/*2.выводится объект в среде main*/
    }

    private static void checkAnotherPerson(Person person) {
        /*объект который мы передали он не используется т.к произошла инициализация нового объекта в этой среде видимости*/
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());/*1.Вывод значения */
    }
}