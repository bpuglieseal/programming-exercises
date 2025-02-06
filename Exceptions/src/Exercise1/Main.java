package Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Input the first number: ");
        a = sc.nextInt();
        System.out.print("Input the first number: ");
        b = sc.nextInt();

        try {
            c = a / b;
            System.out.println("Division between a and b: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
