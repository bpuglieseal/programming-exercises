import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, gt100 = 0;
        float smt10 = 0, csmt10 = 0;

        while (true) {
            System.out.print("Input a number to calculate summation: ");
            n = scan.nextInt();
            int a = 0;
            if (n == 0) break;
            for (int i = 1; i <= Math.abs(n); i++) {
                a += i;
                if (i % 26 == 0) System.out.print("\n");
                if (i == n) System.out.format("%d = ", i);
                else System.out.format("%d + ", i);
            }
            System.out.println(a);
            if (a > 100) gt100++;
            if (n < 10) {
                csmt10++;
                smt10 += n;
            };
        }

        if (csmt10 > 0) {
            System.out.format("Average of the numbers smallers than 10: %,.1f\n", smt10 / csmt10);
        }
        System.out.format("Summations that are greater than 100: %d", gt100);
    }
}
