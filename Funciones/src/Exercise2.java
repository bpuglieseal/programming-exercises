import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise2 {
//  1
//  22
//  333
//  4444
    static void printPattern (int n) {
        IntStream.rangeClosed(1, n).forEach(value -> System.out.print(n));
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) printPattern(i);
    }
}
