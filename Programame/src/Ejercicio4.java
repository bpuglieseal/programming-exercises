import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, M, j = 1;
        char a;

        while(true) {
            N = scan.nextInt();
            M = scan.nextInt();

            if (M == 0) {
                System.out.format("%d^%d = %d", N, M, j); return;
            }

            if (M == 1) {
                System.out.format("%d^%d = %d", N, M, N); return;
            } else if (M == -1) {
                System.out.format("%d^%d = 1/%d", N, M, N); return;
            }

            for (int i = 1; i <= Math.abs(M); i++) j *= N;

            if (M >= 0) System.out.format("%d^%d = %d\n", N, M, j);
            else System.out.format("%d^%d = 1/%d\n", N, M, j);

            System.out.print("Do you want to continue? Y / N: ");
            a = scan.next().charAt(0);

            if (Character.compare(a, 'N') == 0) {
                System.out.println("Bye Bye"); break;
            }
        }
    }
}
