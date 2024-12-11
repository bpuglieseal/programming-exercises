package Excercise5;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        if (Library.isEven(n)) {
            System.out.println("Is even");
        } else {
            System.out.println("Is not even");
        }

        int a = 8000;
        if (Library.isLong(a)) {
            System.out.println("Is long");
        } else {
            System.out.println("Is not long");
        }

        int b = 856474;
        System.out.format("Digit amounts of %d: %d\n", b, Library.digitAmounts(b));
        Library.multipleOf10();
    }
}
