import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.format("Input the number %d: ", i + 1);
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.format("%d -> %d\n", i, a[i]);
        }
    }
}
