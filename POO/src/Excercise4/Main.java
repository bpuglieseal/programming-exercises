package Excercise4;

public class Main {
    public static void main(String[] args) {
        Circumference c = new Circumference("red", 3.56);
        Circumference a = new Circumference("red", 3.56);

        System.out.println("----------- Primera Circunferencia -----------");
        c.show();
        c.printPerimeter();
        if (c.isBig()) {
            System.out.println("The circumference is big");
        } else {
            System.out.println("The circumference is not big");
        }

        System.out.println("----------- Segunda Circunferencia -----------");
        a.show();
        a.printPerimeter();
        if (a.isBig()) {
            System.out.println("The circumference is big");
        } else {
            System.out.println("The circumference is not big");
        }

        System.out.println("---------------------------------------------");
        if (a.equals(c)) {
            System.out.println("The circumferences are equals");
        } else {
            System.out.println("The circumferences are not equals");
        }
    }
}
