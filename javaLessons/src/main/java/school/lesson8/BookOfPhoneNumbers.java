package school.lesson8;

import java.util.ArrayList;

public class BookOfPhoneNumbers {

    private final ArrayList<Persons> personList = new ArrayList<>();

    private static class Persons {
        String surname;
        String phoneNumber;

        public Persons(String surname, String phoneNumber) {
            this.surname = surname;
            this.phoneNumber = phoneNumber;
        }

        public String getSurname() {
            return surname;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
    }

    public void add(String surname, String phoneNumber) {
        this.personList.add(new Persons(surname, phoneNumber));
    }

    public ArrayList<String> get(String surname) {
        ArrayList<String> phoneListBySurname = new ArrayList<>();
        for (Persons item : this.personList) {
            if (item.getSurname().equalsIgnoreCase(surname)) {
                phoneListBySurname.add(item.getPhoneNumber());
            }
        }
        return phoneListBySurname;
    }
}
