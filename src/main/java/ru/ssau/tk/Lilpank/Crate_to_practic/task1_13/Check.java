package ru.ssau.tk.Lilpank.Crate_to_practic.task1_13;

import ru.ssau.tk.Lilpank.Crate_to_practic.Person.task1_2.Person;

public class Check {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt(number);
        checkPerson(person);
        System.out.println(number);
        /*3.Затем выводится в функции main 5, т.к в chekInt() изменилась не сама переменная number
        ,а её копия определенную во время работы этого метода.*/
        System.out.println(person.getFirstName());
        /*4.В конце выводится Oleg т.к объект класса Person ссылается на  данные которые он получил
        из-за того,что в функцию chekPerson() передалась копия адреса объекта.*/
    }

    private static void checkInt(int number) {
        number = 10;
        /*1.выводится 10, в функции chekInt(), т.к в этой функции
        создалась копия переменной int number ссылающаяся на значение 10.*/
        System.out.println(number);
    }

    private static void checkPerson(Person person) {
        person.setFirstName("Oleg");
        /*2.Выводится Oleg в функции checkPerson() т.к передаётся не копия обьекта
        person,а копия ссылки на него,которая будет указывать на тот же объект.*/
        System.out.println(person.getFirstName());
    }
}