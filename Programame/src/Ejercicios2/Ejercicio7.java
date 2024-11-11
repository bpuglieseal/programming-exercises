package Ejercicios2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, a = 0;
        n = scan.nextInt();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                a += i;
            }
        }

        if (a == n) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }
    }
}
