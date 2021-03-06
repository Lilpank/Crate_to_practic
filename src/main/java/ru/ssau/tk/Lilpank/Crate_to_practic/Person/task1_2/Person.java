package ru.ssau.tk.Lilpank.Crate_to_practic.Person.task1_2;

import ru.ssau.tk.Lilpank.Crate_to_practic.task1_17.Gender;

public class Person {
    private String firstName, lastName;
    private int passportId;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private Gender gender;

    public Person() {
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }


    public Person(String firstName, String lastName, Gender gender, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.gender = gender;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassportId() {
        return passportId;
    }
}

class Task1 {
    public static void main(String[] args) {
        Person firstMan = new Person("Dan", "Porfirev");
        Person secondMan = new Person(613132);
        Person secondWomen = new Person("Jasmine", "Bachitova", 813213);

        System.out.println("First women: unknown");
        System.out.println("First man: " + firstMan.getFirstName() + " " + firstMan.getLastName() + "Passport ID: unknown");
        System.out.println("Second man: no name Passport ID: " + secondMan.getPassportId());
        System.out.println("Second women:: " + secondWomen.getFirstName() + " " + secondWomen.getLastName() + "Passport ID:" + secondWomen.getPassportId());

    }

}