package laboratory_6;

public class Person extends TelephoneEntry {
    private final String name;
    private final String lastName;
    private final String address;

    public Person(TelephoneNumber telephoneNumber, String name, String lastName, String address) {
        super(telephoneNumber);
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String description() {
        return "Person {" + "\n" +
                "name = '" + name + '\'' + "\n" +
                "lastName = '" + lastName + '\'' + "\n" +
                "address = '" + address + '\'' + "\n" +
                "telephoneNumber = " + telephoneNumber + "\n" +
                '}' + "\n" ;
    }
}
