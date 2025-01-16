package Excercise12;

public class Main {
    public static void main(String[] args) {
        Tweety tweety = new Tweety(Sex.MALE, 4, 30f, 6);
        Parrot parrot = new Parrot(Sex.FEMALE, 2, Region.EAST, "blue");

        tweety.whoAmI();
        System.out.print("  ");
        parrot.whoAmI();
        System.out.println("\n---------------------------");
        tweety.height();
        parrot.whereAreYouFrom();

        tweety.setSize(8);
        parrot.setRegion(Region.NORTH);

        System.out.println("---------------------------");
        tweety.whoAmI();
        System.out.print("  ");
        parrot.whoAmI();
        System.out.println("\n---------------------------");
        tweety.height();
        parrot.whereAreYouFrom();
    }
}
