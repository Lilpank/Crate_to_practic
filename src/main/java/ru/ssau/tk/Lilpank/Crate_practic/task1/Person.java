package ru.ssau.tk.Lilpank.Crate_practic.task1;

class Person {
    private String firstName, lastName;
    private int passportId;

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
