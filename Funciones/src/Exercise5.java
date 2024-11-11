import java.util.Scanner;


public class Exercise5 {
    //                *
    //               * *
    //              * * *
    //             * * * *
    static void printPattern(int n) {
        for (int i = 1, l = n - 1; i <= n; i++) {
            for (int j = 0; j < l; j++) System.out.print(" ");

            for (int j = 1; j <= i * 2; j++) {
                if (j % 2 == 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
            l--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        printPattern(n);
    }
}



