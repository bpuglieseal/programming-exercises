package Ejercicios2;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n;
        System.out.print("Input a M number: ");
        m = scan.nextInt();

         do {
            System.out.print("Input a N number: ");
            n = scan.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input.");
            }

            for (int i = 1, j = 1; j <= n && i <= m / 2; i++) {
                if (m % i == 0) {
                    System.out.print(i + " ");
                    j++;
                }
            }
            System.out.println(" ");
        } while (n > 0);
    }
}
