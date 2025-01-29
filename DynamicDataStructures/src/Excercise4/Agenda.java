package Excercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Agenda {
    private HashMap<String, ArrayList<String>> entries;
    private int maxEntries;

    Agenda (int maxEntries) {
        this.maxEntries = maxEntries;
        this.entries = new HashMap<String, ArrayList<String>>();
    }

    public HashMap<String, ArrayList<String>> getEntries() {
        return entries;
    }

    public boolean isInAgenda (String name) {
        return this.entries.containsKey(name);
    }

    public String searchName (String name) {
        if (!this.isInAgenda(name)) {
            return String.format("%s no esta en la agenda", name);
        }

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> phones = this.entries.get(name);
        for (String phone : phones) {
            stringBuilder.append(phone).append(" ");
        }

        return stringBuilder.toString();
    }

    public void addEntry (String name, ArrayList<String> phoneNumbers, boolean replace) {
        if (this.entries.containsKey(name) && this.entries.size() <= this.maxEntries) {
            ArrayList<String> phones = this.entries.get(name);

            if (replace) {
                this.entries.put(name, phoneNumbers);
                return;
            }

            Iterator<String> it = phones.iterator();
            System.out.println("Your agenda contains these phone numbers for: ");
            System.out.format("+ %s\n", name);
            while (it.hasNext()) {
                System.out.format("- %s\n", it.next());
            }
        } else if (!this.entries.containsKey(name) && this.entries.size() < this.maxEntries) {
            this.entries.put(name, phoneNumbers);
        } else {
            System.out.println("Full Agenda");
        }
    }

    public int numberOfPhones (String numberPhone) {
        int c = 0;
        for (ArrayList<String> phones : this.entries.values()) {
            if (phones.contains(numberPhone)) c++;
        }
        return c;
    }

    public void display () {
        this.entries.forEach((name, phones) -> {
            System.out.format("+ %s\n", name);
            for (String phone : phones) {
                System.out.format("- %s\n", phone);
            }
        });
    }
}
