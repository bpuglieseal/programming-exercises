package Excercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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

    public String searchName (String name) {
        if (!this.entries.containsKey(name)) {
            return String.format("%s no esta en la agenda", name);
        }

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> phones = this.entries.get(name);
        for (String phone : phones) {
            stringBuilder.append(phone).append(" ");
        }

        return stringBuilder.toString();
    }

    public void addEntry (String name, ArrayList<String> phoneNumbers) {
        if (this.entries.containsKey(name) && this.entries.size() <= this.maxEntries) {
            Scanner sc = new Scanner(System.in);

            StringBuilder stringBuilder = new StringBuilder();
            System.out.println("Tu agenda contiene estos números para: ");
            System.out.format("+ %s\n", name);
            ArrayList<String> phones = this.entries.get(name);
            for (String phone : phones) {
                stringBuilder.append(phone).append(" ");
            }
            System.out.format("- Numeros: %s\n", stringBuilder.toString());
            stringBuilder.setLength(0);
            for (String phone : phoneNumbers) {
                stringBuilder.append(phone).append(" ");
            }
            System.out.format("- ¿Quieres actualizar por los siguientes numeros?: %s\n", stringBuilder.toString());
            System.out.print("- Digite respuesta (Si / No): ");
            String option = sc.nextLine();

            switch (option.toLowerCase()) {
                case "si": {
                    this.entries.put(name, phoneNumbers);
                    System.out.println("Registros Actualizados.");
                    break;
                }
                case "no": {
                    System.out.println("Registros No Fueron Actualizados.");
                    break;
                }
                default: {
                    System.out.println("Opcion Inválida.");
                    break;
                }
            }

        } else if (this.entries.size() < this.maxEntries) {
            this.entries.put(name, phoneNumbers);
        } else {
            System.out.println("No se puede agregar (Full Agenda)");
        }
    }

    public int numberOfPhones (String numberPhone) {
        int count = 0;
        for (ArrayList<String> phones : this.entries.values()) {
            if (phones.contains(numberPhone)) count++;
        }
       return count;
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
