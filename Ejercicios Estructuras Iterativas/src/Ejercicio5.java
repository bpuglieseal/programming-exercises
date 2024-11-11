import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int input;

        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Digite un número: ");
            input = scan.nextInt();

            if (input > 10) {
                System.out.format("%d > 10\n", input);
                counter++;
            } else if (input < 10) {
                System.out.format("%d < 10\n", input);
            } else {
                System.out.format("10 == 10\n");
            }
        }

        System.out.format("Cantidad de nùmeros mayores que 10: %d", counter);
    }
}
