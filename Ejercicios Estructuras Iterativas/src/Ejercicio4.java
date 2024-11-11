import java.util.Scanner;

public class Ejercicio4 {
    //        Read numbers from the keyboard until you find a number below 100
    public static void main(String[] args) {
        boolean isBelowThan = false;
        Scanner scan = new Scanner(System.in);
        int input;

        do {
            System.out.print("Digite un número: ");
            input = scan.nextInt();

            if (input < 100) {
                isBelowThan = true;
                System.out.println("El número es menor a 100!");
            } else {
                System.out.println("Vuelve a intentarlo!");
            }

        }   while (!isBelowThan);
    }
}
