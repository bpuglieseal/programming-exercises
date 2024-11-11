import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise4 {
// 1
// 2 3
// 4 5 6
// 7 8 9 10
    static void printPattern (int n) {
        int a = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                a++;
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        printPattern(n);
    }
}

