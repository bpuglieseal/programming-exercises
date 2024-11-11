import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise3 {
//  1
//  01
//  101
//  0101
    static void printPattern (int n) {
        IntStream.rangeClosed(1, n).forEach(i -> {
            if (n % 2 == 1 && i % 2 == 1) System.out.print(1);
            if (n % 2 == 1 && i % 2 == 0) System.out.print(0);
            if (n % 2 == 0 && i % 2 == 1) System.out.print(0);
            if (n % 2 == 0 && i % 2 == 0) System.out.print(1);
        });
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) printPattern(i);
    }
}
