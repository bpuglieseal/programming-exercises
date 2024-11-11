import java.util.Scanner;

public class Exercise10 {
    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println(" ");
        }

        int l = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < Math.abs(l); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println(" ");
            l++;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        printPattern(n);
    }
}
