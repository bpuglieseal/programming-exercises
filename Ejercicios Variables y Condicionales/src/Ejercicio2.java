import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Programa que lee un número y muestre sus cifras por separado.
        Scanner scan = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite un número: ");
        a = scan.nextInt();

        System.out.print("Digite otro número: ");
        b = scan.nextInt();

        System.out.print("Digite otro número: ");
        c = scan.nextInt();

        if (c > b && b > a) {
            System.out.format("Los numeros fueron agregados en orden ascendente: %d -> %d -> %d", c, b, a);
        } else {
            System.out.println("Los números no fueron ingresados de manera ascendente.");
        }
    }
}