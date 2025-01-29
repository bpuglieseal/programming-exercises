package Excercise4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(2);

        String name = "Baldassare";
        ArrayList<String> phones = new ArrayList<>();
        phones.add("123456789");
        phones.add("123456786");
        phones.add("123456785");
        phones.add("123456783");

        String name1 = "Gabriel";
        ArrayList<String> phones1 = new ArrayList<>();
        phones1.add("123456789");
        phones1.add("123456782");
        phones1.add("123456786");
        phones1.add("123456784");

        String name2 = "Luis";
        ArrayList<String> phones2 = new ArrayList<>();
        phones2.add("123456789");
        phones2.add("123456786");
        phones2.add("123456785");
        phones2.add("123456783");

        System.out.println("Agregando un usuario a la agenda...");
        agenda.addEntry(name, phones, false);
        System.out.println("Agregando un usuario a la agenda...");
        agenda.addEntry(name1, phones1, false);
        System.out.println("Agregando un usuario a la agenda...");
        agenda.addEntry(name2, phones2, false);

        agenda.display();
        System.out.println("Numero de telefonos de Alberto: ");
        System.out.println(agenda.searchName("Alberto"));
        System.out.println("Numero de telefonos de Gabriel: ");
        System.out.println(agenda.searchName("Gabriel"));
        System.out.println("Cantidad de personas con el numero 123456789: " + agenda.numberOfPhones("123456789"));
    }
}
