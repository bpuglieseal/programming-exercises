import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    public static boolean is_prima (int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        
        return number != 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the quantity of primes numbers do you want to calc: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 2, j = 0; i < Integer.MAX_VALUE && j < n; i++) {
            if (is_prima(i)) {
                array[j] = i;
                j++;
            }
        }

        Arrays.stream(array).forEach(a -> {
            System.out.print(a + " ");
        });
    }
}
