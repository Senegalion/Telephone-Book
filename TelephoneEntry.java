package laboratory_6;

public abstract class TelephoneEntry {
    protected TelephoneNumber telephoneNumber;

    public TelephoneEntry(TelephoneNumber telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public abstract String description();
}
