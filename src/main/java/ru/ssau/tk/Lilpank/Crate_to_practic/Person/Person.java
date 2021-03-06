package ru.ssau.tk.Lilpank.Crate_to_practic.Person;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName, lastName;
    private int passportId;

    public Person() {

    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
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

    @Override
    public String toString() {
        return firstName + (firstName.isEmpty() || lastName.isEmpty() ? "" : " ") + lastName;
    }
}

class Task1 {
    public static void main(String[] args) {
        Person women = new Person();
        Person man = new Person();

        women.setFirstName("Jasmine");
        women.setLastName("Bachitova");
        women.setPassportId(631324);

        man.setFirstName("Denis");
        man.setLastName("Dorfirev");
        man.setPassportId(785743);

        System.out.println(man.getFirstName() + " " + man.getLastName() + " Passport ID:" + man.getPassportId());
        System.out.println(women.getFirstName() + " " + women.getLastName() + "Passport ID:" + women.getPassportId());
        Person firstWomen = new Person();
        Person firstMan = new Person("Dan", "Porfirev");
        Person secondMan = new Person(613132);
        Person secondWomen = new Person("Jasmine", "Bachitova", 813213);

        System.out.println("First women: unknown");
        System.out.println("First man: " + firstMan.getFirstName() + " " + firstMan.getLastName() + "Passport ID: unknown");
        System.out.println("Second man: no name Passport ID: " + secondMan.getPassportId());
        System.out.println("Second women:: " + secondWomen.getFirstName() + " " + secondWomen.getLastName() + "Passport ID:" + secondWomen.getPassportId());
    }

}
