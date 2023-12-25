package laboratory_6;

public class Company extends TelephoneEntry {
    private final String name;
    private final String address;

    public Company(TelephoneNumber telephoneNumber, String name, String address) {
        super(telephoneNumber);
        this.name = name;
        this.address = address;
    }

    @Override
    public String description() {
        return "Company {" + "\n" +
                "name = '" + name + '\'' + "\n" +
                "address = '" + address + '\'' + "\n" +
                "telephoneNumber = " + telephoneNumber + "\n" +
                '}' + "\n" ;
    }
}
