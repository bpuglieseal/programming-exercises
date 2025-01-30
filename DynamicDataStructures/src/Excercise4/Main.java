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

        ArrayList<String> phones3 = new ArrayList<>();
        phones3.add("123456781");
        phones3.add("123456782");
        phones3.add("123456783");
        phones3.add("123456784");
        phones3.add("123456785");
        phones3.add("123456786");

        System.out.println("Agregando un primer registro a la agenda: Agregado");
        System.out.println("----------------------------------------");
        agenda.addEntry(name, phones);
        System.out.println("Agregando un segundo registro a la agenda: Agregado");
        System.out.println("----------------------------------------");
        agenda.addEntry(name1, phones1);
        System.out.print("Agregando un tercero registro a la agenda: ");
        agenda.addEntry(name2, phones2);
        System.out.println("----------------------------------------");

        System.out.println("Registros disponibles en la agenda: ");
        agenda.display();
        System.out.println("----------------------------------------");
        System.out.println("Accediento a los numeros de telefono de Alberto (No Existe): ");
        System.out.println(agenda.searchName("Alberto"));
        System.out.println("----------------------------------------");
        System.out.println("Numero de telefonos de Gabriel: ");
        System.out.println(agenda.searchName("Gabriel"));
        System.out.println("----------------------------------------");
        System.out.println("Cantidad de personas con el numero 123456789: " + agenda.numberOfPhones("123456789"));
        System.out.println("----------------------------------------");
        System.out.println("Actualizando una entrada que ya existe: ");
        agenda.addEntry(name, phones3);
        System.out.println("----------------------------------------");
        System.out.println("Registros despues de actualizar: ");
        agenda.display();
    }
}
