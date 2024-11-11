import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");
        int a, b;

        System.out.print("Digite un número: ");
        a = scan.nextInt();

        System.out.print("Digite otro número: ");
        b = scan.nextInt();

        System.out.format("Division: %s \n", formatter.format((double)a / b));
        System.out.format("Division Rest: %s", formatter.format((double)a % b));
    }
}
