import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#00");
        int a;

        System.out.print("Digite una cantidad de segundos: ");
        a = scan.nextInt();

        System.out.format("Minutes: %s \t", formatter.format(a / 60));
        System.out.format("Seconds: %s", formatter.format(a % 60));
    }
}
