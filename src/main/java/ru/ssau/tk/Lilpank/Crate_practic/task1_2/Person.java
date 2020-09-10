package ru.ssau.tk.Lilpank.Crate_practic.task1_2;

class Person {
    private String firstName, lastName;
    private int passportId;

    Person() {
    }

    Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    Person(int passportId) {
        this.passportId = passportId;
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getPassportId() {
        return passportId;
    }
}

class Task1 {
    public static void main(String[] args) {
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