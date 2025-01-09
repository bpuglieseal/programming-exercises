package ChristmasHomework;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String c1IdentityCard = "z1234567g";
        String c2IdentityCard = "z7654321g";
        Client c1 = new Client("Alejandra Diaz", c1IdentityCard, MemberLevel.PREMIUM);
        Client c2 = new Client("Maria Becerra", c2IdentityCard, MemberLevel.PLATINUM);
        Client c3 = new Client("Luisana Gonzales", "z112315g", MemberLevel.GOLD);

        Salon salon = new Salon(3, 3);
        salon.addClient(c1);
        salon.addClient(c2);
        salon.addClient(c3);

        System.out.println("-----------------------------------");
        salon.showClients();
        System.out.println("-----------------------------------");
        System.out.format("Changing the level of the clients with identity card: %s, %s\n", c1IdentityCard, c2IdentityCard);
        if (salon.setMembershipClient(c1IdentityCard, MemberLevel.PREMIUM)) {
            System.out.format("Membership of the client with identity card %s updated\n", c1IdentityCard);
        }
        if (salon.setMembershipClient(c2IdentityCard, MemberLevel.GOLD)) {
            System.out.format("Membership of the client with identity card %s updated\n", c2IdentityCard);
        }
        System.out.println("-----------------------------------");
        salon.showClients();
        System.out.println("-----------------------------------");
        System.out.println("Adding visits for all the clients......");
        Visit c1Visit = new Visit(c1, new Date(2025, Calendar.JANUARY, 5));
        Visit c2Visit = new Visit(c2, new Date(2025, Calendar.JANUARY, 4));
        Visit c3Visit = new Visit(c3, new Date(2025, Calendar.JANUARY, 2));
        salon.addVisit(c1Visit).addVisit(c2Visit).addVisit(c3Visit);
        salon.showVisits();
    }
}
