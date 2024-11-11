import java.util.Scanner;

public class Exercise6 {
    //         1
//            2 3
//           4 5 6
//          7 8 9 10
    static void printPattern(int n) {
        int l = n - 1;
        int c = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < l; j++) System.out.print("\t");

            for (int j = 1; j <= i * 2; j++) {
                if (j % 2 == 1) {
                    System.out.print(c + "\t");
                    c++;
                } else System.out.print("\t");
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
