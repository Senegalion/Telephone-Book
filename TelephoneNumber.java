package laboratory_6;

public class TelephoneNumber implements java.lang.Comparable<TelephoneNumber> {
    private final int countryCode;
    private final int localNumber;

    public TelephoneNumber(int countryCode, int localNumber) {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    public String formatLocalNumber() {
        String localNumberToString = this.localNumber + "";
        String[] localNumberParts = new String[3];
        for (int i = 0, j = 0; i < 9; i += 3, j++) {
            localNumberParts[j] = localNumberToString.substring(i, i + 3);
        }
        StringBuilder formattedLocalNumber = new StringBuilder();
        int partNumber = 0;
        for (String localNumberPart : localNumberParts) {
            partNumber++;
            formattedLocalNumber.append(localNumberPart);
            if (partNumber != 3) {
                formattedLocalNumber.append("-");
            }
        }
        return formattedLocalNumber.toString();
    }

    @Override
    public String toString() {
        return "+" + countryCode +
                " " + formatLocalNumber();
    }

    @Override
    public int compareTo(TelephoneNumber otherTelephoneNumber) {
        int countryCodeComparison = Integer.compare(this.countryCode, otherTelephoneNumber.countryCode);

        if (countryCodeComparison != 0) {
            return countryCodeComparison;
        }

        return Integer.compare(this.localNumber, otherTelephoneNumber.localNumber);
    }
}
