package laboratory_6;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TelephoneBook {
    public static void main(String[] args) {
        Map<TelephoneNumber, TelephoneEntry> telephoneEntryMap = new TreeMap<>();
        displayObjects(telephoneEntryMap);
    }

    private static void displayObjects(Map<TelephoneNumber, TelephoneEntry> telephoneEntryMap) {
        Map<TelephoneNumber, TelephoneEntry> treeMap = new TreeMap<>(createObjects(telephoneEntryMap));

        Iterator<Map.Entry<TelephoneNumber, TelephoneEntry>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<TelephoneNumber, TelephoneEntry> entry = iterator.next();
            System.out.println(entry.getValue().description());
        }
    }

    private static Map<TelephoneNumber, TelephoneEntry> createObjects(Map<TelephoneNumber, TelephoneEntry> telephoneEntryMap) {
        Person person1 = new Person(
                People.PERSON1.getTelephoneNumber(),
                People.PERSON1.getFirstName(),
                People.PERSON1.getLastName(),
                People.PERSON1.getAddress());
        Person person2 = new Person(
                People.PERSON2.getTelephoneNumber(),
                People.PERSON2.getFirstName(),
                People.PERSON2.getLastName(),
                People.PERSON2.getAddress());
        Company company1 = new Company(
                Companies.COMPANY1.getTelephoneNumber(),
                Companies.COMPANY1.getName(),
                Companies.COMPANY1.getAddress());
        Company company2 = new Company(
                Companies.COMPANY2.getTelephoneNumber(),
                Companies.COMPANY2.getName(),
                Companies.COMPANY2.getAddress());

        telephoneEntryMap.put(People.PERSON1.getTelephoneNumber(), person1);
        telephoneEntryMap.put(People.PERSON2.getTelephoneNumber(), person2);
        telephoneEntryMap.put(Companies.COMPANY1.getTelephoneNumber(), company1);
        telephoneEntryMap.put(Companies.COMPANY2.getTelephoneNumber(), company2);

        return telephoneEntryMap;
    }
}
