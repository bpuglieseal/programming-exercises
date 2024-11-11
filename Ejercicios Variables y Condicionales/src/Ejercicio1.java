import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.print("Digite un número: ");
        a = scan.nextInt();

        System.out.print("Digite otro número: ");
        b = scan.nextInt();

        if (a > b) {
            System.out.println(a + " Es mayor que " + b);
        } else if (b > a) {
            System.out.println(b + " Es mayor que " + a);
        } else {
            System.out.println("Ambos numeros tienen el mismo valor.");
        }
    }
}