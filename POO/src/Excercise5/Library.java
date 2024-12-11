package Excercise5;

import java.util.Scanner;

public class Library {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int digitAmounts(int number) {
        return String.valueOf(number).length();
    }

    public static boolean isLong(int number) {
        return number > 9999;
    }

    public static void multipleOf10 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        if (n % 10 == 0) {
            System.out.format("%d is multiply of 10\n", n);
        } else {
            System.out.format("%d is not multiply of 10\n", n);
        }
    }
}
