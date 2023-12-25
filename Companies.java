package laboratory_6;

public enum Companies {
    COMPANY1("Bartnet Naruszewicz i Krawczun Spółka Jawna",
            "ul. Ignacego Paderewskiego 18/18, 11-200 Bartoszyce",
            new TelephoneNumber(48, 897620600)),
    COMPANY2("Taxi Kalisz, Echo taxi.",
            "ul. Widok 102/22a, 62-800 Kalisz",
            new TelephoneNumber(48, 627660542));

    private final String name;
    private final String address;
    private final TelephoneNumber telephoneNumber;

    Companies(String name, String address, TelephoneNumber telephoneNumber) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }
}
