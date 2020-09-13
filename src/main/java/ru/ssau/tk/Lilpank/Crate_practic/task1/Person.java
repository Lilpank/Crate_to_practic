package ru.ssau.tk.Lilpank.Crate_practic.task1;

public class Person {
    private String firstName, lastName;
    private int passportId;

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
        Person women = new Person();
        Person man = new Person();

        women.setFirstName("Jasmine");
        women.setLastName("Bachitova");
        women.setPassportId(631324);

        man.setFirstName("Dan");
        man.setLastName("Porfirev");
        man.setPassportId(785743);

        System.out.println(man.getFirstName() + " " + man.getLastName() + " Passport ID:" + man.getPassportId());
        System.out.println(women.getFirstName() + " " + women.getLastName() + "Passport ID:" + women.getPassportId());

    }

}
