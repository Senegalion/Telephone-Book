package laboratory_6;

public enum People {
    PERSON1("Łukasz",
            "Pelikan",
            "aleje Politechniki 9, 93-590 Łódź",
            new TelephoneNumber(48, 506349098)),
    PERSON2("Katarzyna",
            "Pelikan",
            "Zdziechów-Kolonia 5, 95-083 Lutomiersk",
            new TelephoneNumber(48, 505846772));

    private final String firstName;
    private final String lastName;
    private final String address;
    private final TelephoneNumber telephoneNumber;

    People(String firstName, String lastName, String address, TelephoneNumber telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }
}
